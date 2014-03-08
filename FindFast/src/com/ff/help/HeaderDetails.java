package com.ff.help;

import java.io.IOException;
import java.util.Enumeration;

import javax.servlet.ServletException;

import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class HeaderDetails extends DynamoServlet{
	public void service(DynamoHttpServletRequest request,DynamoHttpServletResponse response) throws ServletException, IOException{
		Enumeration str=request.getHeaderNames();
		request.setParameter("result",str);
		request.serviceLocalParameter("output",request,response);
	}
}
