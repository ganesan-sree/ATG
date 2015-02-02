package atg.dynamo.messaging;

import javax.jms.BytesMessage;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.ObjectMessage;
import javax.jms.StreamMessage;
import javax.jms.TextMessage;

public class ECCRMessageSink implements atg.dms.patchbay.MessageSink {

	@Override
	public void receiveMessage(String pPortName, Message pMessage)
			throws JMSException {
		System.out.println("Received message from port " + pPortName
				+ " of JMSType " + pMessage.getJMSType());

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		if (pMessage instanceof TextMessage) {
			System.out.println("  TextMessage, value = \""
					+ ((TextMessage) pMessage).getText() + "\"");
		} else if (pMessage instanceof ObjectMessage) {
			System.out.println("  ObjectMessage, value = \""
					+ ((ObjectMessage) pMessage).getObject() + "\"");
		} else if (pMessage instanceof MapMessage) {
			System.out.println("  MapMessage");
		} else if (pMessage instanceof StreamMessage) {
			System.out.println("  StreamMessage");
		} else if (pMessage instanceof BytesMessage) {
			System.out.println("  BytesMessage");
		}

	}

}
