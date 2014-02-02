<%@ taglib uri="/dspTaglib" prefix="dsp"%>
<%@ taglib uri="/jstl" prefix="c"%>
<dsp:page>
<html>

<dsp:importbean bean = "/com/paypal/droplet/PaypalCheckoutDroplet"/>
<dsp:importbean bean="/atg/commerce/ShoppingCart"/>

<dsp:droplet name="PaypalCheckoutDroplet">
<dsp:param name="paymentAmount" value="1"/>
<dsp:param name="returnURL" value="http://localhost/ff/catalog/paypal/return.jsp"/>
<dsp:param name="cancelURL" value="http://localhost/ff/catalog/paypal/cancel.jsp"/>
<dsp:param name="payPalURL" value="https://www.sandbox.paypal.com/webscr&cmd=_express-checkout&token="/>
</dsp:droplet>

</html>
</dsp:page>