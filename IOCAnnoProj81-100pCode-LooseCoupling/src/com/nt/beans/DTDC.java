package com.nt.beans;

import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Description;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component(value="dtdc")
@Primary
@Description(value = "Depedent bean")
public class DTDC  implements Courier{
	
	public DTDC() {
		System.out.println("DTDC:: 0-param constructor");
	}
	
	public   String  deliver(int oid) {
		return "DTDC is delivering  "+oid+" order id products";
	}

}
