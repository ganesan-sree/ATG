package com.paypal.droplet;

import java.io.IOException;
import java.util.HashMap;

import javax.servlet.http.HttpSession;

import com.paypal.util.PaypalUtil;

import atg.core.util.StringUtils;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class PaypalCheckoutDroplet extends DynamoServlet{
	
	private String returnURL;
	
	private String cancelURL;
	
	private String payPalURL;

	public String getReturnURL() {
		return returnURL;
	}

	public void setReturnURL(String returnURL) {
		this.returnURL = returnURL;
	}

	public String getCancelURL() {
		return cancelURL;
	}

	public void setCancelURL(String cancelURL) {
		this.cancelURL = cancelURL;
	}

	public String getPayPalURL() {
		return payPalURL;
	}

	public void setPayPalURL(String payPalURL) {
		this.payPalURL = payPalURL;
	}

	public void service(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse){

        HttpSession session = pRequest.getSession(true);

        /*
        '-------------------------------------------
        ' The paymentAmount is the total value of
        ' the shopping cart, that was set
        ' earlier in a session variable
        ' by the shopping cart page
        '-------------------------------------------
        */

        String paymentAmount = (String) session.getAttribute("Payment_Amount");

        if(paymentAmount==null){
        	paymentAmount = pRequest.getParameter("paymentAmount");
        }
        /*
        '------------------------------------
        ' The returnURL is the location where buyers return to when a
        ' payment has been succesfully authorized.
        '
        ' This is set to the value entered on the Integration Assistant
        '------------------------------------
        */

        if(StringUtils.isBlank(getReturnURL()))
        returnURL = pRequest.getParameter("returnURL");//"http://localhost/ClothStore/cart/ReturnPage.jsp";

        /*
        '------------------------------------
        ' The cancelURL is the location buyers are sent to when they hit the
        ' cancel button during authorization of payment during the PayPal flow
        '
        ' This is set to the value entered on the Integration Assistant
        '------------------------------------
        */
        if(StringUtils.isBlank(getCancelURL()))
        cancelURL = pRequest.getParameter("cancelURL");//"http://localhost/ClothStore/cart/CancelPage.jsp";
        
        if(StringUtils.isBlank(getPayPalURL()))
        payPalURL = pRequest.getParameter("payPalURL");

        /*
        '------------------------------------
        ' Calls the SetExpressCheckout API call
        '
        ' The CallShortcutExpressCheckout function is defined in the file PayPalFunctions.asp,
        ' it is included at the top of this file.
        '-------------------------------------------------
        */
        PaypalUtil ppf = new PaypalUtil();
        HashMap nvp = ppf.CallShortcutExpressCheckout (paymentAmount, returnURL, cancelURL);
        String strAck = nvp.get("ACK").toString();
        if(strAck !=null && strAck.equalsIgnoreCase("Success"))
        {
            session.setAttribute("token", nvp.get("TOKEN").toString());
            //' Redirect to paypal.com
            try {
				pResponse.sendRedirect(pResponse.encodeRedirectURL( payPalURL+nvp.get("TOKEN").toString() ));
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
        }
        else
        {
            // Display a user friendly Error on the page using any of the following error information returned by PayPal

            String ErrorCode = nvp.get("L_ERRORCODE0").toString();
            String ErrorShortMsg = nvp.get("L_SHORTMESSAGE0").toString();
            String ErrorLongMsg = nvp.get("L_LONGMESSAGE0").toString();
            String ErrorSeverityCode = nvp.get("L_SEVERITYCODE0").toString();
        }
	}
	
}
