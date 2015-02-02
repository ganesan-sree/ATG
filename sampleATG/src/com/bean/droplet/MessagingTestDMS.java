package com.bean.droplet;

import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

import javax.jms.JMSException;
import javax.servlet.ServletException;

import com.event.StockEvent;
import com.event.StockPricer;

import atg.dynamo.messaging.ECCRMessageSource;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class MessagingTestDMS extends DynamoServlet {

	public MessagingTestDMS() {
		System.out.println(" MessagingTestDMS component getting start.... \n\n Success");
	}

	private ECCRMessageSource source;

	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {
		System.out.println(getSource());
		try {
			getSource().sendMessage();
		} catch (JMSException e) {			
			e.printStackTrace();
		}

	}

	public ECCRMessageSource getSource() {
		return source;
	}

	public void setSource(ECCRMessageSource source) {
		this.source = source;
	}

}
