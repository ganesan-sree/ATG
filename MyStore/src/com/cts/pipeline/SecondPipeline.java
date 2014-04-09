package com.cts.pipeline;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

import atg.servlet.pipeline.PipelineableServlet;

public class SecondPipeline implements PipelineableServlet {

	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public ServletConfig getServletConfig() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String getServletInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void init(ServletConfig arg0) throws ServletException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void service(ServletRequest arg0, ServletResponse arg1)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setNextServlet(Servlet paramServlet) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Servlet getNextServlet() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void passRequest(ServletRequest paramServletRequest,
			ServletResponse paramServletResponse) throws IOException,
			ServletException {
		// TODO Auto-generated method stub
		
	}

}
