
import java.util.Hashtable;

import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.Session;
import javax.jms.TextMessage;
import javax.naming.Context;
import javax.naming.InitialContext;

public class HelloWorldJMS {

    public static void main(String[] args) {

  try {



/*


 * Connecting to JBoss naming service running on local host and on


 * default port 1099 the environment that should be created is like the


 * one shown below :


 */


Hashtable env = new Hashtable();


env.put(Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");


env.put(Context.PROVIDER_URL, "jnp://localhost:1099");


env.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");





// Create the initial context


Context ctx = new InitialContext(env);





// Lookup the JMS connection factory from the JBoss 5.1 object store


javax.jms.ConnectionFactory connectionFactory = (ConnectionFactory) ctx.lookup("ConnectionFactory");
  


// Lookup a queue from the JBoss 5.1 object store


Queue queue = (javax.jms.Queue)ctx.lookup("/queue/DLQ");



// Create a connection to the JBoss 5.1 Message Service


Connection connection = connectionFactory.createConnection();



// Create a session within the connection


Session session = connection.createSession(false, Session.AUTO_ACKNOWLEDGE);



// Create a message producer to put messages on the queue


MessageProducer messageProducer = session.createProducer(queue);



//Create and send a message to the queue


TextMessage textMessage = session.createTextMessage();


textMessage.setText("Hello World");


System.out.println("Sending Message: " + textMessage.getText());


messageProducer.send(textMessage);



// Create a message consumer


MessageConsumer messageConsumer = session.createConsumer(queue);



// Start the Connection created


connection.start();



// Receive a message from the queue.


Message msg = messageConsumer.receive();



// Retrieve the contents of the message.


if (msg instanceof TextMessage) {


    TextMessage txtMsg = (TextMessage) msg;


    System.out.println("Read Message: " + txtMsg.getText());


}



//Close the session and connection resources.


session.close();


connection.close();


  } catch (Exception ex) {


ex.printStackTrace();

  }
    }

}