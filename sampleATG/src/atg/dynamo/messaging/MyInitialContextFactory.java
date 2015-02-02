package atg.dynamo.messaging;

import java.util.Hashtable;

import javax.naming.*;

import atg.dms.patchbay.*;

public class MyInitialContextFactory implements JMSInitialContextFactory
{
	  public Context createInitialContext (String pProviderName,
	                                 String pUsername,
	                                 String pPassword,
	                                 String pClientId)
	    throws NamingException
	  {

	      Hashtable h = new Hashtable ();
	      h.put (Context.INITIAL_CONTEXT_FACTORY, "org.jnp.interfaces.NamingContextFactory");
	      h.put (Context.PROVIDER_URL, "jnp://localhost:1099");
	      h.put(Context.URL_PKG_PREFIXES, "org.jboss.naming:org.jnp.interfaces");

	    return new InitialContext (h);
	  }
}
