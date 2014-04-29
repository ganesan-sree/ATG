<!--
This sample code is designed to connect to Authorize.net using the SIM method.
For API documentation or additional sample code, please visit:
http://developer.authorize.net

Most of this page can be modified using any standard html. The parts of the
page that cannot be modified are noted in the comments.  This file can be
renamed as long as the file extension remains .jsp
-->

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" 
  "http://www.w3.org/TR/html4/loose.dtd">
<HTML lang='en'>
<HEAD>
	<TITLE> Sample SIM Implementation </TITLE>
</HEAD>
<BODY>

<!-- This section generates the "Submit Payment" button using JSP           -->
<%@ page import="java.util.*" %>
<!-- SimpleDateFormat is used to generate an invoice number based off of the date -->
<%@ page import="java.text.SimpleDateFormat" %>
<!-- the following imports are used to generate the fingerprint -->
<%@ page import="java.security.*" %>
<%@ page import="javax.crypto.*" %>
<%@ page import="javax.crypto.spec.SecretKeySpec" %>

<%

// the parameters for the payment can be configured here
// the API Login ID and Transaction Key must be replaced with valid values
String loginID			= "8NpEM9b8mJ";
String transactionKey	= "56673SB8AvbdV4c5";
String amount			= "19.99";
String description		= "Sample Transaction";
String label 			= "Submit Payment"; // The is the label on the 'submit' button
String testMode			= "false";

// By default, this sample code is designed to post to our test server for
// developer accounts: https://test.authorize.net/gateway/transact.dll
// for real accounts (even in test mode), please make sure that you are
// posting to: https://secure.authorize.net/gateway/transact.dll
String url			= "https://test.authorize.net/gateway/transact.dll";

// If an amount or description were posted to this page, the defaults are overidden
if ( request.getParameter("amount") != null )
	{ amount = request.getParameter("amount"); }
if ( request.getParameter("description") != null )
	{ description = request.getParameter("description"); }

// an invoice is generated using the date and time
Date myDate = new Date();
SimpleDateFormat dateFormat = new SimpleDateFormat("yyyyMMddHHmmss");
String invoice = dateFormat.format(myDate);
// a sequence number is randomly generated
Random generator = new Random();
int sequence = generator.nextInt(1000);
// a timestamp is generated
long timeStamp = System.currentTimeMillis()/1000;

//This section uses Java Cryptography functions to generate a fingerprint
	// First, the Transaction key is converted to a "SecretKey" object
	KeyGenerator kg = KeyGenerator.getInstance("HmacMD5");
	SecretKey key = new SecretKeySpec(transactionKey.getBytes(), "HmacMD5");
	// A MAC object is created to generate the hash using the HmacMD5 algorithm
	Mac mac = Mac.getInstance("HmacMD5");
	mac.init(key);
	String inputstring = loginID + "^" + sequence + "^" + timeStamp + "^" + amount + "^";
	byte[] result = mac.doFinal(inputstring.getBytes());
	// Convert the result from byte[] to hexadecimal format
	StringBuffer strbuf = new StringBuffer(result.length * 2);
	for(int i=0; i< result.length; i++)
	{
		if(((int) result[i] & 0xff) < 0x10)
			strbuf.append("0");
		strbuf.append(Long.toString((int) result[i] & 0xff, 16));
	}
	String fingerprint = strbuf.toString();
// end of fingerprint generation

// Print the Amount and Description to the screen.
out.println ("Amount: " + amount + " <br />");
out.println ("Description: " + description + "<br />");

// Create the HTML form containing necessary SIM post values
out.println ("<FORM method='post' action='" + url + "' >");
// Additional fields can be added here as outlined in the SIM integration guide
// at: http://developer.authorize.net
out.println ("	<INPUT type='hidden' name='x_login' value='" + loginID + "' />");
out.println ("	<INPUT type='hidden' name='x_amount' value='" + amount + "' />");
out.println ("	<INPUT type='hidden' name='x_description' value='" + description + "' />");
out.println ("	<INPUT type='hidden' name='x_invoice_num' value='" + invoice + "' />");
out.println ("	<INPUT type='hidden' name='x_fp_sequence' value='" + sequence + "' />");
out.println ("	<INPUT type='hidden' name='x_fp_timestamp' value='" + timeStamp + "' />");
out.println ("	<INPUT type='hidden' name='x_fp_hash' value='" + fingerprint + "' />");
out.println ("	<INPUT type='hidden' name='x_test_request' value='" + testMode + "' />");
out.println ("	<INPUT type='hidden' name='x_show_form' value='PAYMENT_FORM' />");
out.println ("	<input type='submit' value='" + label + "' />");
out.println ("</FORM>");
%>
<!-- This is the end of the code generating the "submit payment" button.    -->
</BODY>
</HTML>