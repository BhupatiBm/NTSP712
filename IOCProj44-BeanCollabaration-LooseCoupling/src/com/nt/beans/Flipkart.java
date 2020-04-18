package com.nt.beans;

import java.util.Arrays;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Flipkart {
	//@Autowired(required = false)
	@Autowired
	@Qualifier(value = "cr2")
	//@Qualifier(value = "dtdc")
	private Courier courier;
	
	/*@Autowired
	public Flipkart(Courier cr) {
	   System.out.println("Flipkart::1-param constructor");
		this.courier = cr;
	}*/
	
	/*@Autowired
	public Flipkart(Courier cr,int x) {
	   System.out.println("Flipkart::2-param constructor");
		this.courier = cr;
	}
	*/

	/*	@Autowired
		//@Qualifier("cr1")
		public void setCourier(Courier bDart) {
		 System.out.println("Flipkart.setCourier()");
		this.courier = bDart;
		}*/
	
	/*	@Autowired
		//@Qualifier("cr1")
		public  void  assign(Courier dhl) {
			System.out.println("Flipkart.assign(-)");
			this.courier=dhl;
		}
	*/

	public Flipkart() {
		System.out.println("Flipkart:: 0-param constructor");
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
