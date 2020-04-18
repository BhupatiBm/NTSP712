package com.cb.locator;

import org.springframework.beans.factory.FactoryBean;

import com.icc.external.IccScoreComp;
import com.icc.external.IccScoreCompImpl;

public class IccScoreCompServiceLocator {
          private static IccScoreComp  extComp=new IccScoreCompImpl();
          
          public static  IccScoreComp getInstance() {
        	  System.out.println("IccScoreCompServiceLocator.getInstance(-)");
        	  return  extComp;
          }

}
