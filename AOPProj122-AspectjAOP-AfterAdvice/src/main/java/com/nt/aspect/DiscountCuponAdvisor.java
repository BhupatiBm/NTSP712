package com.nt.aspect;

import java.io.FileWriter;

import org.aspectj.lang.JoinPoint;

public class DiscountCuponAdvisor {
	public void generateCupon(JoinPoint jp,float billamt)throws Throwable{
		String cuponmsg=null;
		FileWriter fw=null;
		if(billamt>=5000)
			cuponmsg="Avail Discount Of 30% in next order";
		if(billamt>=3000)
			cuponmsg="Avail Discount of 20% in next order";
		if(billamt>2000)
			cuponmsg="Avail discount upto 10% in next order";
		else
			cuponmsg="no discount........sorry";
		fw=new FileWriter("f:/logges/Discount.text");
		fw.write(cuponmsg);
		fw.flush();
		fw.close();
		
	}

}
