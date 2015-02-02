package com.event;

public class StockEvent extends java.util.EventObject {
	String symbol;
	double price;

	public StockEvent(Object source, String symbol, double price) {
		super(source);
		this.symbol = symbol;
		this.price = price;
	}

	public String getSymbol() {
		return symbol;
	}

	public double getPrice() {
		return price;
	}
}
