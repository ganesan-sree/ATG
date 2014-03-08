package com.sexy.external.ajax;

import java.util.Locale;
import java.util.ResourceBundle;

import com.sexy.atg.router.ServletRequestRouter;
import com.sexy.constants.ConstantValue;

import atg.core.util.StringUtils;
import atg.nucleus.Nucleus;
import atg.nucleus.NucleusNameResolver;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class AjaxHandler extends DynamoServlet {
	
	
	public void service(DynamoHttpServletRequest pReq,DynamoHttpServletResponse pRes){
		ResourceBundle resourceBundle=ResourceBundle.getBundle(ConstantValue.RESOURCE_BUNDLE,Locale.US);
		String routerString=pReq.getParameter(ConstantValue.ROUTER_VALUE);
		
		if(!StringUtils.isEmpty(routerString)){
			String routeTo=resourceBundle.getString(routerString);
			if(routeTo!=null){
				ServletRequestRouter router=(ServletRequestRouter)pReq.resolveName(routeTo);
				router.service(pReq, pRes);
			}
		}
	}
}
