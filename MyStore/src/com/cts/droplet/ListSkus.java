package com.cts.droplet;

import java.io.*;
import javax.servlet.*;
import atg.servlet.*;
import atg.nucleus.*;
import atg.adapter.gsa.*;
import atg.repository.*;
import atg.repository.rql.*;
 
public class ListSkus extends DynamoServlet {
  public void service(DynamoHttpServletRequest request, DynamoHttpServletResponse response) throws ServletException, IOException {
    try {
      GSARepository r = (GSARepository)Nucleus.getGlobalNucleus().resolveName("/atg/commerce/catalog/ProductCatalog");
      RepositoryView view = r.getView("sku");
      RqlStatement rql = RqlStatement.parseRqlStatement("ALL");
      Object params[] = new Object[0];
      RepositoryItem[] answer = rql.executeQuery(view,params);
      System.out.println(answer);
      
      if (answer != null) {
        for(int i =0; i < answer.length; i++) {
          request.setParameter("items", answer[i]);
          request.serviceParameter("output", request, response);
        }
      }
      else {
        request.setParameter("items", "No SKU's found");
        request.serviceParameter("output", request, response);
      }
    }
    catch (Exception e) {
      e.printStackTrace();
    }
  }
}