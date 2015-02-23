package atg.dynamo.messaging;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import atg.dms.patchbay.MessageSourceContext;
import atg.servlet.DynamoServlet;

public class ECCRMessageSource extends  DynamoServlet implements atg.dms.patchbay.MessageSource {

	private boolean mStarted;
	private MessageSourceContext mContext;

	@Override
	public void setMessageSourceContext(
			MessageSourceContext paramMessageSourceContext) {
		mContext = paramMessageSourceContext;

	}

	@Override
	public void startMessageSource() {
		mStarted = true;

	}

	@Override
	public void stopMessageSource() {
		mStarted = false;

	}
	
	
	

	public MessageSourceContext getmContext() {
		return mContext;
	}

	public void setmContext(MessageSourceContext mContext) {
		this.mContext = mContext;
	}

	// This method will send a message
	public void sendMessage() throws JMSException {
		System.out.println(mContext);
		if (mStarted && mContext != null) {
			int i = 0;
			while (i < 10) {
				TextMessage msg = mContext.createTextMessage();
				msg.setJMSType("atg.test.Test1");
				msg.setText("Sending the Test text string");
				mContext.sendMessage(msg);
				i++;
			}
		}
	}

}
