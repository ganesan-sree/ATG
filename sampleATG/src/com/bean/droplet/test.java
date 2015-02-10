package com.bean.droplet;

import java.io.IOException;

import javax.servlet.ServletException;

import atg.nucleus.logging.LogEvent;
import atg.nucleus.logging.LogListener;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class test extends DynamoServlet {


	
	private LogListener logListener;
	public test() {
		System.out.println(" test component getting start.... \n\n\n\n\n");
	}

	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {
		int i=0;
		
		System.out.println("@@@@@@@@@@@@@@");
		
		while (i < 200) {
			LogEvent l = new LogEvent("heeeloo"+i);
			getLogListener().logEvent(l);
			i++;
		}
		System.out.println("compl");

	}

	public LogListener getLogListener() {
		return logListener;
	}

	public void setLogListener(LogListener logListener) {
		this.logListener = logListener;
	}



	
	
}
