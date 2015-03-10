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
import atg.repository.MutableRepository;
import atg.repository.MutableRepositoryItem;
import atg.repository.RepositoryException;
import atg.repository.RepositoryItem;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class ExecutorThreadService extends DynamoServlet {

	public ExecutorThreadService() {
		System.out.println(" ExecutorThreadService component getting start.... \n\n Success");
	}
	
	MutableRepository profileRepository;

	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {
		try {
		System.out.println("Executorrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrrtt");
		RepositoryItem userItem1 = getProfileRepository().getItem("", "user");
		System.out.println(userItem1+"HJJJJJJJJJJJJJJJJJJJJJJJJJJJJJJ-----------");
		RepositoryItem pintsItem =(RepositoryItem) userItem1.getPropertyValue("points");
		
		MutableRepositoryItem mutableUserItem = null;
		
		if(pintsItem==null){
			mutableUserItem=getProfileRepository().createItem("points");
			
		}else{
			mutableUserItem=getProfileRepository().getItemForUpdate("158680576","points");
		}
		
		Integer availableBalance	=(Integer) mutableUserItem.getPropertyValue("availableBalance");
		
		System.out.println(mutableUserItem);
		
		if(availableBalance ==null){
			availableBalance=0;
		}
		
		availableBalance = availableBalance + 10;								
		mutableUserItem.setPropertyValue("availableBalance",availableBalance);
		
		
			getProfileRepository().updateItem(mutableUserItem);
		} catch (RepositoryException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
		
	}

	public MutableRepository getProfileRepository() {
		return profileRepository;
	}

	public void setProfileRepository(MutableRepository profileRepository) {
		this.profileRepository = profileRepository;
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
