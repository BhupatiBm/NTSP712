package com.nt.test;

import org.springframework.beans.factory.BeanFactory;

import com.nt.beans.Cricketer;
import com.nt.utility.IOCContainerUtility;

public class DependencyLookupTest {
	public static void main(String[] args) {
		BeanFactory factory=null;
		Cricketer crcket=null;
		factory=IOCContainerUtility.getContainer();
		crcket=factory.getBean("crck",Cricketer.class);
		crcket.filding();
		crcket.batting();
		crcket.bowling();
	}

}
