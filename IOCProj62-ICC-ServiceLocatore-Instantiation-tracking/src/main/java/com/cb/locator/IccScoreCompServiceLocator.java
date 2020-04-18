package com.cb.locator;

import org.springframework.beans.factory.FactoryBean;

import com.icc.external.IccScoreComp;
import com.icc.external.IccScoreCompImpl;

public class IccScoreCompServiceLocator implements FactoryBean<IccScoreComp> {
	private IccScoreComp extComp=new IccScoreCompImpl();
	@Override
	public IccScoreComp getObject() throws Exception {
		System.out.println("IccScoreCompServiceLocator.getObject()");
		if(extComp!=null)
			extComp=new IccScoreCompImpl();
		return extComp;
	}

	@Override
	public Class<?> getObjectType() {
		System.out.println("IccScoreCompServiceLocator.getObjectType()");
		return IccScoreComp.class;
	}
	
	@Override
	public boolean isSingleton() {
		System.out.println("IccScoreCompServiceLocator.isSingleton()");
		return true;
	}

	}


