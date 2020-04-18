package com.nt.replacer;

import java.lang.reflect.Method;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.support.MethodReplacer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;
@Component(value="irr")
@PropertySource(value = "classpath:com/nt/commons/myfile.properties")
public class IntrRateReplacer implements MethodReplacer {
	@Value("${roi}")
	private float rate=1.0f;
	
	public IntrRateReplacer() {
		System.out.println("IntrRateReplacer:: 0-param constructor");
	}



	@Override
	public Object reimplement(Object obj, Method method, Object[] args) throws Throwable {
		System.out.println("IntrRateReplacer.reimplement(-)");
		float pAmt=(Float)args[0];
		float time=(Float)args[1];
		return pAmt*time*rate/100.0f;
	}

}
