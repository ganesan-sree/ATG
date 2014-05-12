package com.cts.rest;

import java.util.HashMap;
import java.util.Map;

import atg.nucleus.GenericService;

public class RestMVCServices extends GenericService {
	
	public Map<String, String> doLogin(String name) {
		Map<String , String > responseMap = new HashMap<String, String>();
		
		responseMap.put("0000", "success");
		return responseMap;
	}

	
	public Map<String, String> doCreate(String name) {
		Map<String , String > responseMap = new HashMap<String, String>();
		
		responseMap.put("0000", "success");
		return responseMap;
	}
}
