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

public class ExecutorThreadService extends DynamoServlet {

	public ExecutorThreadService() {
		System.out.println(" ExecutorThreadService component getting start.... \n\n Success");
	}

	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {

		int i = 0;
		ExecutorService executorService = Executors.newFixedThreadPool(10);
		// new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS,
		// new ArrayBlockingQueue<Runnable>(15));
		while (i < 101) {
			executorService.execute(new Runnable() {
				public void run() {
					System.out.println("Asynchronous task ");
					System.out.println(Thread.currentThread().getName()
							+ " Start.");
					try {
						Thread.sleep(20000);
					} catch (InterruptedException e) {
						e.printStackTrace();
					}
				}
			});
			System.out.println(i);
			System.out.println("@@@@@@@@@@@@@@");

			i++;
		}
		executorService.shutdown();
	}

	// class Task implements Callable<String> {
	// @Override
	// public String call() throws Exception {
	// Thread.sleep(4000); // Just to demo a long running task of 4 seconds.
	// System.out.println("*****************************************");
	// return "Ready!";
	// }
	// }

}
