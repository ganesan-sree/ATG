package com.n.order.purchase;

import java.io.IOException;

import javax.servlet.ServletException;

import atg.commerce.order.OrderHolder;
import atg.commerce.pricing.PricingTools;
import atg.commerce.promotion.PromotionTools;
import atg.core.util.StringUtils;
import atg.droplet.DropletException;
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.ServletUtil;

import com.n.order.Order;

public class CouponFormHandler extends atg.commerce.promotion.CouponFormHandler{

	public Order order;
	
	public PricingTools pricingTools; 
	
	public PromotionTools promotionTools;
	
	private MutableRepository productCatalog;

	public MutableRepository getProductCatalog() {
		return productCatalog;
	}

	public void setProductCatalog(MutableRepository productCatalog) {
		this.productCatalog = productCatalog;
	}

	public PromotionTools getPromotionTools() {
		return promotionTools;
	}

	public void setPromotionTools(PromotionTools promotionTools) {
		this.promotionTools = promotionTools;
	}

	public PricingTools getPricingTools() {
		return pricingTools;
	}

	public void setPricingTools(PricingTools pricingTools) {
		this.pricingTools = pricingTools;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}
	
	public boolean handleClaimCoupon(DynamoHttpServletRequest pRequest,DynamoHttpServletResponse pResponse)throws ServletException,IOException{
			OrderHolder holder = (OrderHolder)pRequest.resolveName("/atg/commerce/ShoppingCart");
			
			setOrder((Order)holder.getCurrent());
			logDebug("order is "+getOrder());
			String couponAdded = order.getCouponAdded();
			if(couponAdded!=null && !StringUtils.isBlank(couponAdded)){
				MutableRepositoryItem item;
				try {
					item = getProductCatalog().getItemForUpdate(getCouponClaimCode(),"promotion");
					getPromotionTools().removePromotion(getProfile(), item, true);
					getPromotionTools().initializePricingModels();
					logDebug("am here in if");
				} catch (RepositoryException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			
			
				
			
			}else{
				logDebug("am here in else");
			}
			getOrder().setCouponAdded(getCouponClaimCode());
			return super.handleClaimCoupon(pRequest, pResponse);
	}
	
}
