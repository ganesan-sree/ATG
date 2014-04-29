import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import atg.rest.client.RestClientException;
import atg.rest.client.RestComponentHelper;
import atg.rest.client.RestResult;
import atg.rest.client.RestSession;

/**
 * Method Call implementation through REST API
 * 
 * @author ashish
 * 
 */
public class RESTClient {

	/** The m username. */
	private String mUsername;

	/** The m password. */
	private String mPassword;

	/** The m host. */
	private String mHost;

	/** The m port. */
	private int mPort;

	/** The m session. */
	private RestSession mSession = null;

	/**
	 * Instantiates a new method call by rest.
	 */
	public RESTClient() {
	}

	/**
	 * Execute.
	 * @throws IOException 
	 * 
	 * @throws RestClientException
	 *             the rest client exception
	 */
	private void execute() throws IOException {

		mSession = RestSession
				.createSession(mHost, mPort, mUsername, mPassword);
		mSession.setUseHttpsForLogin(false);

		Map<String, Object> params = new HashMap<String, Object>();

		params.put("atg-rest-input", "json");
		//params.put("name", "json");
		
		
		RestResult result = null;
		try {
			result = RestComponentHelper.executeMethod(
					"/com/cts/rest/RestServices", "doLogin",
					new Object[] {"gan"}, params, mSession);
			
			System.out.println(result.getResponseMessage());
			System.out.println(result.getResponseCode());
			System.out.println(result.readInputStream());

		} catch (RestClientException e1) {
			System.out.println(e1);
		}

		try {
			if (result != null && result.getResponseCode() == 200) {
				System.out.println("Executed Successfully.");
			} else {
				System.out.println("Error while execution : Error Code ["
						+ result.getResponseCode() + "] and Message ["
						+ result.getResponseMessage() + "]");
			}
		} catch (IOException e) {
			System.out.println("Error while execution Successfully.");
		}
	}

	/**
	 * @param args
	 * @throws IOException 
	 */
	public static void main(String[] args) throws IOException {
		RESTClient stepUtils = new RESTClient();
		stepUtils.mUsername = "admin";
		stepUtils.mPassword = "admin";
		stepUtils.mHost = "localhost";
		stepUtils.mPort = 8080;
		stepUtils.execute();

	}

}