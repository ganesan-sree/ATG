package com.bean.droplet;

import java.io.IOException;
import javax.servlet.ServletException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

import com.event.StockEvent;
import com.event.StockPricer;

public class EventListernerTest extends DynamoServlet {

	private StockPricer listerner;

	public EventListernerTest() {
		System.out
				.println(" EventListernerTest component getting start.... \n\n Success");
	}

	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {

		int i = 0;

		while (i < 10) {
			StockEvent ev = new StockEvent(this, "ATGC", 20.75 + i);
			getListerner().broadcastStockEvent(ev);
			i++;
		}

	}

	public StockPricer getListerner() {
		return listerner;
	}

	public void setListerner(StockPricer listerner) {
		this.listerner = listerner;
	}

}
