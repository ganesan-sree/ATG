package com.bean.queues;

import atg.nucleus.logging.LogEvent;
import atg.nucleus.logging.LogListener;

public class FileLogger implements LogListener {

	@Override
	public void logEvent(LogEvent paramLogEvent) {
		System.out.println("received ");
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
