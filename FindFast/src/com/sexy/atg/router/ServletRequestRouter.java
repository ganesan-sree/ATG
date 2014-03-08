package com.sexy.atg.router;

import com.sexy.constants.ConstantValue;

import atg.nucleus.GenericService;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;

public class ServletRequestRouter extends GenericService{

		public void service(DynamoHttpServletRequest pReq,DynamoHttpServletResponse pRes){
			if(isLoggingDebug()){
				logDebug("Got the request from the router");
				logDebug("And the request is gonna route to "+pReq.getParameter(ConstantValue.ROUTER_VALUE));
			}
		}
}
