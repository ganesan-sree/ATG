package com.ff;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.SocketException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.commons.net.ftp.FTPClient;



public class CopyEAR extends HttpServlet{
	
	public void service(HttpServletRequest pRequest,HttpServletResponse pResponse)throws IOException{
		String from = (String)pRequest.getParameter("from");
		String to=(String)pRequest.getParameter("to");
		PrintWriter writer = pResponse.getWriter();
		if(from!=null && to!=null){
			File file = new File(from);
			String fileName = file.getName();
			if(file.exists()){
			FileInputStream in=new FileInputStream(from);
			FileOutputStream out = new FileOutputStream(to+"/"+fileName);
			//String line="";
			int line=1;
			
			byte b[]=new byte[1024];
			while(in.available()>0){
				if(in.available()>1024){
					b=new byte[1024];
					
				}else{
					b=new byte[in.available()];
					
				}
				in.read(b);
				out.write(b);
				
			}
			
			writer.write("<b> File copied successfully </b>");
			in.close();
			out.close();
			}else{
				writer.write("<font color='red'> File doest exists </font>");
			}
		}else{
			writer.write("<b> Not a valid input </b>");
		}
	}
	public static void main(String ... args){
		FTPClient ftpClient = new FTPClient();
		try {
			ftpClient.connect("144.230.24.65");
			boolean login = ftpClient.login("bf120318", "Wpts.123");
			System.out.println("login is "+login);
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
}
