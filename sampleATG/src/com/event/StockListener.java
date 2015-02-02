package com.event;

public interface StockListener extends java.util.EventListener {
	public void stockPriceUpdated(StockEvent ev);
}
