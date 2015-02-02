package com.event;

public class StockPricer  {
	  java.util.Vector listeners = new java.util.Vector ();

	  public StockPricer () {
	   
	  }
	
	 
	  
	  public synchronized void addStockListener (StockListener listener) {
	    listeners.addElement (listener);
	  }
	  public synchronized void removeStockListener (StockListener listener) {
	    listeners.removeElement (listener);
	  }
	  public synchronized StockListener [] getStockListeners () {
	    StockListener [] ret = new StockListener [listeners.size ()];
	    listeners.copyInto (ret);
	    return ret;
	  }
	  public void broadcastStockEvent (StockEvent ev) {
		  Thread t = Thread.currentThread();
	      String name = t.getName();
	      System.out.println("name=" + name);
	    for (int i = 0; i < listeners.size (); i++) {
	      ((StockListener) listeners.elementAt (i)).stockPriceUpdated (ev);
	    }
	  }
}
