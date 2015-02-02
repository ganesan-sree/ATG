package com.bean.droplet;



import java.io.IOException;
import java.util.Arrays;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

import javax.jms.JMSException;
import javax.servlet.ServletException;














import com.event.StockEvent;
import com.event.StockPricer;

import atg.dynamo.messaging.ECCRMessageSource;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class test extends DynamoServlet{
	
	
	private ECCRMessageSource source;
	
	private StockPricer lis;
	
	public test () {		
		System.out.println(" test component getting start.... \n\n\n\n\n");
	}
	  public void service (DynamoHttpServletRequest request,
	                       DynamoHttpServletResponse response)
	       throws ServletException, IOException
	  {
//		  System.out.println(getSource());
//		  try {
//		  getSource().sendMessage();
//		} catch (JMSException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		int i = 0;
//		while (i < 10) {			
//			StockEvent ev = new StockEvent(this, "ATGC", 20.75 + i);
//			getLis().broadcastStockEvent(ev);
//			i++;
//		}
		  int i = 0;
		 
			while (i < 100) {	
				 ExecutorService executorService = Executors.newSingleThreadExecutor();
				executorService.execute(new Runnable() {
					public void run() {
						System.out.println("Asynchronous task");
						try {
							Thread.sleep(20000);
						} catch (InterruptedException e) {
							// TODO Auto-generated catch block
							e.printStackTrace();
						}
					}
				});
System.out.println("@@@@@@@@@@@@@@");


				executorService.shutdown();
			i++;
	  }
	}
	  
	  
	public ECCRMessageSource getSource() {
		return source;
	}
	public void setSource(ECCRMessageSource source) {
		this.source = source;
	}
	public StockPricer getLis() {
		return lis;
	}
	public void setLis(StockPricer lis) {
		this.lis = lis;
	}





	  
	class Task implements Callable<String> {
		@Override
		public String call() throws Exception {
			Thread.sleep(4000); // Just to demo a long running task of 4 seconds.
			System.out.println("*****************************************");
			return "Ready!";
		}
	}
	  
	  
	
	  
	  

	  
	  
}
