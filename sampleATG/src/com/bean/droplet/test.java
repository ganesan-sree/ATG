package com.bean.droplet;

import java.io.IOException;
import javax.servlet.ServletException;
import atg.servlet.DynamoHttpServletRequest;
import atg.servlet.DynamoHttpServletResponse;
import atg.servlet.DynamoServlet;

public class test extends DynamoServlet {


	public test() {
		System.out.println(" test component getting start.... \n\n\n\n\n");
	}

	public void service(DynamoHttpServletRequest request,
			DynamoHttpServletResponse response) throws ServletException,
			IOException {
		System.out.println("@@@@@@@@@@@@@@");

	}

}
