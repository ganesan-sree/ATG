package atg.dynamo.messaging;

import javax.jms.JMSException;
import javax.jms.TextMessage;

import atg.dms.patchbay.MessageSourceContext;

public class ECCRMessageSource implements atg.dms.patchbay.MessageSource {

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
