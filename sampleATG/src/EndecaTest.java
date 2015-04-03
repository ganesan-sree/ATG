import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import com.endeca.content.ContentException;
import com.endeca.content.InitializationException;
import com.endeca.content.ene.ENEContentManager;
import com.endeca.content.ene.ENEContentQuery;
import com.endeca.content.ene.ENEContentResults;
import com.endeca.navigation.ENEConnection;
import com.endeca.navigation.ENEQuery;
import com.endeca.navigation.ENEQueryResults;
import com.endeca.navigation.ERec;
import com.endeca.navigation.ERecList;
import com.endeca.navigation.HttpENEConnection;
import com.endeca.navigation.Navigation;
import com.endeca.navigation.PropertyMap;
import com.endeca.navigation.UrlENEQuery;
import com.endeca.navigation.UrlENEQueryParseException;

public class EndecaTest 
{
	
	static int count = 1;
	public static void main(String[] args){
		try {
			long currenttime = System.currentTimeMillis();
			executeContentQuery();
			long endTime = System.currentTimeMillis() - currenttime;
			System.out.println("time taken   ="+String.valueOf(endTime));
		} catch (UrlENEQueryParseException e) {
				e.printStackTrace();
		} catch (InitializationException e) {		
			e.printStackTrace();
		} catch (ContentException e) {		
			e.printStackTrace();
		}
	}
	
	
		/**
	 * 
	 * This method builds the query from the URL state object and it is passed to endeca engine 
	 * It returns the content results Map
	
	 * 
	 */

	public static Map executeContentQuery () throws  InitializationException, ContentException, UrlENEQueryParseException
	{
		Map contentSet = new HashMap();
		ENEContentResults contentResults;
		UrlENEQuery nequery = new UrlENEQuery();
		Set<String> profiles = new HashSet<String>();
		
		nequery.setNtt("baby");
		nequery.setN("0");
		nequery.setNtx("mode+matchallpartial");
		nequery.setNavNumERecs(100);
		nequery.setNty("1");
		nequery.setNtk("All");
		nequery.setNo("0");
		
		//N=0&Ne=14&Ntk=Refine&Ntt=baby&Ntx=mode+matchallpartial&Nty=1
						
		contentResults = getQueryResults(nequery,true);

		contentSet.put("Result", contentResults);
		recordsList(contentResults.getENEQueryResults());


		return contentSet;
	}	
	
	
	static void recordsList(ENEQueryResults results){
		Navigation nav = results.getNavigation();
		
		ERecList list = nav.getERecs();
		long start = System.currentTimeMillis();
		if(null != list){
			Iterator<ERec> erecs = list.iterator();
			
			while(erecs.hasNext()){
				ERec erec = erecs.next();
				PropertyMap props = erec.getProperties();
				Collection val = props.getValues("p_PickupStoreId");
				System.out.println(props);
			}
		}
		long end = System.currentTimeMillis() - start;
		System.out.println("time taken inside loop "+String.valueOf(end));
	}


	

	/**
	 * 
	 * This method gets the ENEQuery as input parameter and establishes a connection to Endeca engine
	 * and returns the ENEContentResults
	 * 
	 * @param ENEQuery
	 * 
	 * 
	 */

	public static ENEContentResults getQueryResults (ENEQuery  nequery,boolean pNavAllRefinements) throws  InitializationException, ContentException 
	{	
		ENEConnection connection = new HttpENEConnection("10.242.245.144","15000");
		ENEContentResults resultSet = null;
		
		if (connection != null) {

			nequery.setNavAllRefinements(true);
			ENEContentManager contentManager;

			contentManager = new ENEContentManager();
			contentManager.setValidating(false);
			String contentZone = new String("Zone One");
			ENEContentQuery contentQuery = (ENEContentQuery) contentManager
					.createQuery();
			contentQuery.setENEQuery(nequery);
			contentQuery.setENEConnection(connection);
			contentQuery.setRuleZone(contentZone);
			resultSet = (ENEContentResults) contentQuery.execute();
			resultSet.getENEQueryResults();
		

		}
		return resultSet;
	}
	
}