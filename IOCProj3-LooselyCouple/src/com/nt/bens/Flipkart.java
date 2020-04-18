package com.nt.bens;
import java.io.ObjectInputStream.GetField;
import java.util.Random;

public class Flipkart {
	private Courier courier;
	public Flipkart() {
		System.out.println("FlipKart 0 param constructor");
	}
	public void setCourier(Courier courier) {
		System.out.println("Flipkart:Set Courier(-);");
		this.courier=courier;
	}
	public String purchase(String items[],  float bill[]) {
		Random rad=new Random();
		int orderid=rad.nextInt(725663);
		
		float billamt=0.0f;
		for(int i=0;i<bill.length;i++) {
			billamt=billamt+bill[i];
		}
		String totalbill =String.valueOf(billamt);
		String status=courier.deliver(orderid,totalbill);
		return status+" \n\n---Thank you for choosing FlipKart-----.";
	}//method
	

}//class
