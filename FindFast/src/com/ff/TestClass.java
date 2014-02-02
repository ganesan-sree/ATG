package com.ff;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.servlet.http.HttpServlet;

import atg.commerce.order.purchase.CreateElectronicShippingGroupFormHandler;
import atg.commerce.order.purchase.CreateHardgoodShippingGroupFormHandler;
import atg.commerce.order.purchase.ElectronicShippingGroupInitializer;
import atg.commerce.order.purchase.HardgoodShippingGroupInitializer;

/*import java.io.DataInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;



import atg.commerce.order.CommerceItemContainerImpl;
import atg.commerce.order.CommerceItemManager;
import atg.commerce.order.GiftCertificate;
import atg.commerce.order.HardgoodShippingGroup;
import atg.commerce.order.OrderHolder;
import atg.commerce.order.OrderImpl;
import atg.commerce.order.purchase.CartModifierFormHandler;
import atg.commerce.order.purchase.CreateCreditCardFormHandler;
import atg.commerce.order.purchase.CreditCardInitializer;
import atg.commerce.order.purchase.ExpressCheckoutFormHandler;
import atg.commerce.order.purchase.PaymentGroupDroplet;
import atg.commerce.order.purchase.PaymentGroupFormHandler;
import atg.commerce.order.purchase.PurchaseProcessFormHandler;
import atg.commerce.order.purchase.ShippingGroupDroplet;
import atg.commerce.order.purchase.ShippingGroupFormHandler;
import atg.commerce.payment.PaymentManager;
import atg.commerce.payment.processor.ProcCreateCreditCardInfo;
import atg.commerce.payment.processor.ProcProcessCreditCard;
import atg.commerce.pricing.AvailableShippingMethodsDroplet;
import atg.commerce.pricing.FixedPriceShippingCalculator;
import atg.commerce.pricing.ItemListPriceCalculator;
import atg.commerce.pricing.ItemPriceCalculator;
import atg.commerce.pricing.ItemPricingEngineImpl;
import atg.commerce.pricing.PricingModelHolder;
import atg.commerce.pricing.ShippingPricingCalculator;
import atg.droplet.ForEach;
import atg.service.pipeline.PipelineManager;
import atg.taglib.dspjsp.DspPageValidator;*/

public class TestClass extends HttpServlet {
	public static void main(String ... args){
		/*try {
			Class.forName("oracle.jdbc.driver.OracleDriver"); //Or any other driver

			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "pioneer","pioneer");
			Statement statement = con.createStatement();
			
			ResultSet set = statement.executeQuery("SELECT * FROM dps_user");
			if(set!=null){
				System.out.println("set is available");
			}
		}
		catch(Exception x){
			System.out.println( "Unable to load the driver class!" +x);
			
		}*/
		
	/*	DataInputStream in = new DataInputStream(System.in);
		
		String s;
		try {
			s = in.readLine();
			if(s!=null){
				char []n = s.toCharArray();
				int c[]=new int[s.length()];
				for(int i=0;i<n.length;i++){
					char d=n[i];
					c[i]=1;
					for(int k=i+1;k<n.length;k++){
						if(d==n[k]){
							c[i]++;
							n[k]='-';
						}
					}
				}
				for(int l=0;l<n.length;l++){
					if(n[l]!='-')
					System.out.println(c[l]+ " -- "+n[l]);
				}
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
	/*	Set<String> set = new HashSet<String>();
		new TestClass().addSet(set);
		set.add("raju");
		set.add("maddy");
		set.add("sivaji");
		List<String> list = new ArrayList<String>();
		list.addAll(set);
		Collections.sort(list);
		for(String s:list){
			System.out.println(s);
		}
		return 1;*/
		
		String[] s= "BOO:AND:FOO".split("O",0);
		for(String a:s){
			System.out.println("val is "+a);
		}
		
	}
/*	AvailableShippingMethodsDroplet s;
	
	PaymentGroupDroplet s1;
	
	ShippingGroupFormHandler form;
	
	ProcCreateCreditCardInfo info;
	ProcProcessCreditCard card;
	
	
	
	OrderImpl l;
	OrderHolder holder;
	
	PaymentGroupDroplet droplet;
	
	PaymentGroupFormHandler i;
	
	CreateCreditCardFormHandler fo;
	
	PurchaseProcessFormHandler f;
	
	CreditCardInitializer j;
	ExpressCheckoutFormHandler exp;
	PaymentManager manager;
	
	CommerceItemContainerImpl impl;
	
	CommerceItemManager managers;
	
	CartModifierFormHandler cart;
	
	ShippingGroupDroplet shipping;
	
	ShippingGroupFormHandler ship;
	
	HardgoodShippingGroup gr;
	
	ItemPricingEngineImpl pricing;
	
	ItemListPriceCalculator r;
	
	AvailableShippingMethodsDroplet ll;
	
	PricingModelHolder hhh;
	
	ItemPriceCalculator lll;
	
	PipelineManager managersPipeline;
	
	GiftCertificate certificate;
	
	DspPageValidator valid;
	
	ForEach each;
	*/
	
	public void addSet(Set<String> set){
		set.add("testing");
	}
	
	CreateHardgoodShippingGroupFormHandler formhandler;
	
	CreateElectronicShippingGroupFormHandler electronic;
	
	ElectronicShippingGroupInitializer ini;
	
	HardgoodShippingGroupInitializer init;
}
