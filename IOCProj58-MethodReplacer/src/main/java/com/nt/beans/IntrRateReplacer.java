package com.nt.beans;

import java.lang.reflect.Method;

import org.springframework.beans.factory.support.MethodReplacer;

public class IntrRateReplacer implements MethodReplacer {

	private float rate=2.0f;
	
	public IntrRateReplacer() {
		System.out.println("IntrRateReplacer::0 param constructor");
	}
	
	public void setRate(float rate) {
		this.rate=rate;
	}
	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("IntrRateReplacer.reimplement(-,-,-)");
		if(method.getName().contentEquals("clcIntrAmt")) {
			float pamt=((float)args[0]);
			float time=((float)args[1]);
			return pamt*time*rate/100;
		}
		else
			return 0.0f;
	}

}
