<%@ taglib uri="/dspTaglib" prefix="dsp"%>


<dsp:page>

<dsp:importbean bean="/atg/commerce/order/purchase/CouponFormHandler"/>
what is this
<dsp:form action="cart_items.jsp" method="post">

	<dsp:input type="hidden" value="http://localhost:8180/ff/" bean="CouponFormHandler.claimCouponErrorURL"/>
	
	<dsp:input type="text" bean="CouponFormHandler.couponClaimCode"/>
	
	<dsp:input type="submit" bean="CouponFormHandler.claimCoupon"/>

</dsp:form>

</dsp:page>