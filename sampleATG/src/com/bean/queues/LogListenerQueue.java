package com.bean.queues;



import atg.service.queue.EventQueueElement;

/**
 *
 * <p>This is a queueing version of the interface
 * atg.nucleus.logging.LogListener.
 * Calls made to this class are queued, then passed
 * on to the listeners of this interface
 *
 * <p>This class was generated automatically by
 * atg.service.queue.EventQueueGenerator using the command 
 * java atg.service.queue.EventQueueGenerator atg.nucleus.logging.LogListener com.queues LogListenerQueue atg.service.queue.EventQueue
 **/

public class LogListenerQueue
extends atg.service.queue.EventQueue
implements atg.nucleus.logging.LogListener
{
  //-------------------------------------
  // The object representation of a method call

  class ParamBlock implements EventQueueElement {
    int callType;
    atg.nucleus.logging.LogEvent param0;
    public void clearValues () {
      param0 = null;
    }
    public void copyTo (EventQueueElement pElem) {
      ParamBlock b = (ParamBlock) pElem;
      b.callType = callType;
      b.param0 = param0;
    }
  }

  protected EventQueueElement createElement ()
  {
    return new ParamBlock ();
  }

  //-------------------------------------
  // Event listener list

  atg.nucleus.logging.LogListener [] queueListeners = 
    new atg.nucleus.logging.LogListener [4];
  int queueListenerCount;

  //-------------------------------------
  // Constructor
  public LogListenerQueue () {
  }

  //-------------------------------------
  // Queue event listener methods
  //-------------------------------------

  public synchronized void
  addLogListener (atg.nucleus.logging.LogListener pListener)
  {
    if (queueListenerCount >= queueListeners.length) {
      atg.nucleus.logging.LogListener [] newa = new atg.nucleus.logging.LogListener [queueListeners.length * 2];
      System.arraycopy (queueListeners, 0, newa, 0, queueListeners.length);
      queueListeners = newa;
    }
    queueListeners [queueListenerCount++] = pListener;
  }

  public synchronized void
  removeLogListener (atg.nucleus.logging.LogListener pListener)
  {
    for (int i = 0; i < queueListenerCount; i++) {
      if (queueListeners [i] == pListener) {
        System.arraycopy (queueListeners, i + 1,
                          queueListeners, i,
                          queueListenerCount - i - 1);
        queueListeners [--queueListenerCount] = null;
        break;
      }
    }
  }

  public synchronized int getLogListenerCount ()
  {
    return queueListenerCount;
  }

  public synchronized atg.nucleus.logging.LogListener [] getLogListeners ()
  {
    atg.nucleus.logging.LogListener [] ret = 
      new atg.nucleus.logging.LogListener [queueListenerCount];
    System.arraycopy (queueListeners, 0,
                      ret, 0,
                      queueListenerCount);
    return ret;
  }

  //-------------------------------------
  // atg.nucleus.logging.LogListener methods
  //-------------------------------------

  // Stub for method logEvent
  public synchronized void
  logEvent (
    atg.nucleus.logging.LogEvent arg0)
  {
    ParamBlock p = (ParamBlock) getQueueHead ();
    p.callType = 0;
    p.param0 = arg0;
    addElement ();
  }

  //-------------------------------------
  // Dispatcher
  //-------------------------------------

  protected void 
  dispatchElement (EventQueueElement pElem)
  {
    ParamBlock b = (ParamBlock) pElem;
    try {
      switch (b.callType) {
      case 0:
        for (int i = 0; i < queueListenerCount; i++)
          queueListeners [i].logEvent (b.param0);
        break;
      }
    }
    catch (Throwable exc) {
      handleDispatchError (exc);
    }
  }
}

