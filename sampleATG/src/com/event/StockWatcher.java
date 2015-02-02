package com.event;

public class StockWatcher implements StockListener {
	public StockWatcher() {
	}

	public void stockPriceUpdated(StockEvent ev) {
		try {
			Thread.sleep(4000);
		} catch (InterruptedException exc) {
		}
		System.out.println("Stock " + ev.getSymbol() + " is at price "
				+ ev.getPrice());
	}
}