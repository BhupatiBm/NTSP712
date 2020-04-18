package com.nt.test;



import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;
import org.springframework.core.io.Resource;

import com.nt.beans.Printer;
import com.nt.beans.WishMessageGenerator;

public class SetterInjectionTest {
	public static void main(String[] args) {
		Resource res=null;
		BeanFactory factory=null; 
		WishMessageGenerator generator1=null,generator2=null;
		Printer pntr1=null,pntr2=null;
		res= new FileSystemResource("src/com/nt/cnfg/ApplicationContext.xml");
		factory=new XmlBeanFactory(res);
		generator1=factory.getBean("wmg",WishMessageGenerator.class);
		generator2=factory.getBean("wmg",WishMessageGenerator.class);
		System.out.println(generator1.hashCode() +" 	"+generator2.hashCode() );
		System.out.println(generator1==generator2);
		System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
		pntr1=factory.getBean("pntr",Printer.class);
		pntr2=factory.getBean("pntr",Printer.class);
		System.out.println(pntr1.hashCode()+"  "+pntr2.hashCode());
		System.out.println(pntr1==pntr2);
	}

}
