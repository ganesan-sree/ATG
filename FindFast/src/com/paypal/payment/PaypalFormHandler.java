package com.paypal.payment;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;

import atg.commerce.order.Order;
import atg.commerce.order.ShippingGroupContainer;
import atg.commerce.order.purchase.CommerceIdentifierPaymentInfo;
import atg.commerce.order.purchase.CommerceIdentifierPaymentInfoContainer;
import atg.commerce.order.purchase.PaymentGroupDroplet;
import atg.commerce.order.purchase.PaymentGroupFormHandler;
import atg.nucleus.GenericService;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.ServletUtil;

public class PaypalFormHandler extends GenericService{

	private PaymentGroupFormHandler handler;
	
	private String key;
	
	private String successURL;
	
	private String errorURL;
	
	private PaypalInitializer initializer;
	
	private PaymentGroupDroplet paymentGroupDroplet;
	
	private Order order;
	
	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

	public PaymentGroupDroplet getPaymentGroupDroplet() {
		return paymentGroupDroplet;
	}

	public void setPaymentGroupDroplet(PaymentGroupDroplet paymentGroupDroplet) {
		this.paymentGroupDroplet = paymentGroupDroplet;
	}

	private CommerceIdentifierPaymentInfoContainer paymentInfoContainer;

	public CommerceIdentifierPaymentInfoContainer getPaymentInfoContainer() {
		return paymentInfoContainer;
	}

	public void setPaymentInfoContainer(
			CommerceIdentifierPaymentInfoContainer paymentInfoContainer) {
		this.paymentInfoContainer = paymentInfoContainer;
	}

	public PaypalInitializer getInitializer() {
		return initializer;
	}

	public void setInitializer(PaypalInitializer initializer) {
		this.initializer = initializer;
	}

	public String getSuccessURL() {
		return successURL;
	}

	public void setSuccessURL(String successURL) {
		this.successURL = successURL;
	}

	public String getErrorURL() {
		return errorURL;
	}

	public void setErrorURL(String errorURL) {
		this.errorURL = errorURL;
	}

	public PaymentGroupFormHandler getHandler() {
		return handler;
	}

	public void setHandler(PaymentGroupFormHandler handler) {
		this.handler = handler;
	}

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}
	
	public void addPaymentGroupToOrder(String orderId,Order order,String key,String payerId) throws ServletException, IOException{
		
			setOrder(order);
		
		Paypal paypal = getInitializer().addPaymentGroup(key,payerId);
		
	
		
		getPaymentGroupDroplet().setInitOrderPayment(true);
		getPaymentGroupDroplet().setInitBasedOnOrder(false);
		getPaymentGroupDroplet().setInitItemPayment(false);
		getPaymentGroupDroplet().setInitPaymentGroups(false);
		getPaymentGroupDroplet().setInitShippingPayment(false);
		getPaymentGroupDroplet().setInitTaxPayment(false);
		getPaymentGroupDroplet().initializeCommerceIdentifierPayment(getOrder());
		getHandler().setListId(orderId);
		((CommerceIdentifierPaymentInfo)(getHandler().getCurrentList().get(0))).setPaymentMethod(key);
		getHandler().setApplyDefaultPaymentGroup(true);
		getHandler().setApplyPaymentGroupsSuccessURL(getSuccessURL());
		getHandler().setApplyPaymentGroupsErrorURL(getErrorURL());
		DynamoHttpServletRequest pRequest = ServletUtil.getCurrentRequest();
		DynamoHttpServletResponse pResponse = ServletUtil.getCurrentResponse();
		
		getHandler().handleApplyPaymentGroups(pRequest, pResponse);
		
	}
	
	/*protected void initializeItemPayment(Order pOrder)
    {
        List pCommerceIdentifiers = pOrder.getCommerceItems();
        Iterator iter = pCommerceIdentifiers.iterator();
        CommerceItem item = null;
        CommerceIdentifierPaymentInfo cipi;
        for(; iter.hasNext(); getCommerceIdentifierPaymentInfoContainer().addCommerceIdentifierPaymentInfo(item.getId(), cipi))
        {
            item = (CommerceItem)iter.next();
            getCommerceIdentifierPaymentInfoContainer().removeCommerceIdentifierPaymentInfos(item.getId());
            cipi = new CommerceItemPaymentInfo();
            cipi.setCommerceIdentifier(item);
            cipi.setRelationshipType(cipi.getAmountType());
            cipi.setPaymentMethod(getPaymentGroupMapContainer().getDefaultPaymentGroupName());
            AmountInfo ai = item.getPriceInfo();
            if(ai != null)
                cipi.setAmount(ai.getAmount());
            cipi.setQuantity(item.getQuantity());
        }

    }*/
	
}
