package com.cts.handler;

import java.io.*;
import javax.servlet.*;
 
import atg.adapter.gsa.*;
import atg.commerce.order.*;
import atg.commerce.order.purchase.*;
import atg.commerce.pricing.*;
import atg.commerce.profile.*;
import atg.core.util.*;
import atg.nucleus.*;
import atg.droplet.*;
import atg.servlet.*;
import atg.repository.*;
import atg.repository.rql.*;
import atg.service.pipeline.*;
 
public class OrderRunner extends GenericFormHandler {
 
  String sku;
  String product;
  int quantity;
 
  public OrderRunner() {}
 
  public void setQuantity(int quantity) {
    this.quantity = quantity;
  }
 
  public int getQuantity() {
    return quantity;
  }
 
  public void setSku(String sku) {
    this.sku = sku;
  }
 
  public String getSku() {
    return sku;
  }
 
  public void setProduct(String product) {
    String s = product.substring(product.indexOf(":") + 1);
    this.product = s.replace("]","");
  }
 
  public String getProduct() {
    return product;
  }
 
  public boolean handleSave(DynamoHttpServletRequest pRequest,
                            DynamoHttpServletResponse pResponse) throws ServletException, IOException {
    try {
    	System.out.println("11111111111111111111111111111");
      OrderManager orderManager = (OrderManager)Nucleus.getGlobalNucleus().resolveName("/atg/commerce/order/OrderManager");
      CommerceItemManager commerceItemManager = (CommerceItemManager)Nucleus.getGlobalNucleus().resolveName("/atg/commerce/order/CommerceItemManager");
      ShippingGroupManager shippingGroupManager = (ShippingGroupManager)Nucleus.getGlobalNucleus().resolveName("/atg/commerce/order/ShippingGroupManager");
      PricingTools pricingTools = (PricingTools)Nucleus.getGlobalNucleus().resolveName("/atg/commerce/pricing/PricingTools");
      CommerceProfileTools commerceProfileTools = (CommerceProfileTools)Nucleus.getGlobalNucleus().resolveName("/atg/userprofiling/ProfileTools");
 System.out.println("!!!!!!!!!!!!!!!!!!!!!");
      String profileId = "370000";
      
      Order order = orderManager.createOrder(profileId);
      System.out.println("222222222222222222222222");
 
      ///sku chosen must have populated list_price in dcs_sku table
      CommerceItem item1 = commerceItemManager.createCommerceItem(getSku(),getProduct(),getQuantity());
      commerceItemManager.addItemToOrder(order, item1);
 System.out.println("33333333333333333333333333333333333333333333333");
      GSARepository r = (GSARepository)Nucleus.getGlobalNucleus().resolveName("/atg/userprofiling/ProfileAdapterRepository");
 
      RepositoryView view = r.getView("contactInfo");
      RqlStatement rql = RqlStatement.parseRqlStatement("ownerId = ?0");
      Object params[] = new Object[1];
      params[0] = new String(profileId);
      RepositoryItem[] answer = rql.executeQuery(view,params);
      myContactInfo rci = null;
      if (answer != null) {
        for (int i=0; i<answer.length; i++) {
          MutableRepository mr = (MutableRepository)answer[i].getRepository();
          MutableRepositoryItem mri = mr.getItemForUpdate(answer[i].getRepositoryId(),answer[i].getItemDescriptor().getItemDescriptorName());
          rci = new myContactInfo(mri);
        }
      }
      if (isLoggingDebug()) {
        try {
          vlogDebug(rci.getFristName());
          vlogDebug(rci.getLastName());
         
        }
        catch (Exception e) {
          e.printStackTrace();
        }
      }
 
      view = r.getView("user");
      rql = RqlStatement.parseRqlStatement("id = ?0");
      answer = rql.executeQuery(view,params);
 
      HardgoodShippingGroup sg = (HardgoodShippingGroup)order.getShippingGroups().get(0);
      sg.setShippingAddress(rci);
      commerceItemManager.addItemQuantityToShippingGroup(order, item1.getId(), sg.getId(), getQuantity());
      if (isLoggingDebug())
        vlogDebug(sg.toString());
 
      PaymentGroup pg = (PaymentGroup)order.getPaymentGroups().get(0);
      orderManager.addRemainingOrderAmountToPaymentGroup(order, pg.getId());
 
      commerceProfileTools.copyCreditCardToPaymentGroup("Real card", (CreditCard)pg, answer[0], new java.util.Locale("en"));
      pricingTools.priceOrderTotal(order);
 
      if (isLoggingDebug()) {
        vlogDebug("Payment method = " + pg.getPaymentMethod());
        vlogDebug("Pricing info = " + pricingTools.toString());
        vlogDebug("CreditCard = " + commerceProfileTools.getDefaultCreditCard(answer[0]));
      }
 
      PipelineResult pr = orderManager.processOrder(order);
      if (pr.hasErrors()) {
        Object[] keys = pr.getErrorKeys();
        for (int i = 0; i < keys.length; i++) {
          System.out.println("ERROR = " + pr.getError(keys[i]));
        }
        pResponse.sendRedirect("orderError.jsp");
        return false;
      }
      return true;
    }
    catch (Exception e) {
      e.printStackTrace();
      return false;
    }
  }
}

