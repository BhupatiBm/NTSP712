package com.nt.test;

import java.util.Calendar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.test.ex1.WishMessageGenerator;

@SpringBootApplication
public class IocProj88BootSetterInjectionApplication {
	
	@Bean(name="calendar")
	public  Calendar createCalendar() {
		return Calendar.getInstance();
	}

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator generator=null;
		//create IOC container
		ctx=SpringApplication.run(IocProj88BootSetterInjectionApplication.class, args);
		System.out.println("ctx object is"+ctx.getClass());
		//get WishMessageGenerator bean objecct
		generator=ctx.getBean("wmg",WishMessageGenerator.class);
		//invoke method
		System.out.println("Result:::"+generator.generateWishMessage("raja"));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
		
	}

}
