package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import javax.inject.Inject;
import javax.inject.Named;

@Named("fpkt")
public class Flipkart {
	@Inject
	//@Named("dtdc")
	private Courier courier;
	
	public Flipkart() {
		System.out.println("Flipkart::0-param constructor");
	}

	public  String   shopping(String[] items,float[] prices) {
		  float billAmt=0.0f;
		  String msg=null;
		  int oid=0;
		  //generate billAmount
		  for(float price:prices)
			    billAmt=billAmt+price;
		  // generate order id
		  oid=new Random().nextInt(1000);
		  //use Dependent /DTDC for delivery
		    msg=courier.deliver(oid);
		  return  Arrays.toString(items)+" are shopped having prices"+Arrays.toString(prices)+" with bill Amt::"+billAmt+" Delivery status::"+msg;
	}//shopping(-)
}//class
