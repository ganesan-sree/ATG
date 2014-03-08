package com.paypal.droplet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpSession;

import com.paypal.payment.PaypalFormHandler;

import atg.commerce.order.Order;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class PaypalDroplet extends DynamoServlet{

	private PaypalFormHandler handler;
	
	public void service(DynamoHttpServletRequest pRequest, DynamoHttpServletResponse pResponse){
		try {
			String orderId = (String)pRequest.getParameter("orderId");
			Order order = (Order)pRequest.getObjectParameter("order");
			String key = (String)pRequest.getParameter("token");
			String payerId=(String)pRequest.getParameter("payerId");
			HttpSession session = pRequest.getSession();
			session.setAttribute("token", key);
			session.setAttribute("payerId",payerId);
			getHandler().setErrorURL("http://localhost/ff/catalog/paypal/cancel.jsp");
			getHandler().setSuccessURL("http://localhost/ff/catalog/confirm.jsp");
			getHandler().addPaymentGroupToOrder(orderId,order,key,payerId);
			
			
			
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public PaypalFormHandler getHandler() {
		return handler;
	}

	public void setHandler(PaypalFormHandler handler) {
		this.handler = handler;
	}
}
