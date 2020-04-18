package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Import;

import com.nt.beans.WishMessageGenerator;
import com.nt.config.AppConfig;

@SpringBootApplication
@Import(value = AppConfig.class)
public class IocProj88BootSetterInjectionApplication {

	public static void main(String[] args) {
		ApplicationContext ctx=null;
		WishMessageGenerator generator=null;
		//get IOC container
		ctx=SpringApplication.run(IocProj88BootSetterInjectionApplication.class, args);
		System.out.println(ctx.getClass());
		
		//get Target Bean class obj
		generator=ctx.getBean("WMG",WishMessageGenerator.class);
		//invoke method
		System.out.println("Wish Message ::"+generator.genrateWishMessage("Saurav"));
		
		//close container
		((ConfigurableApplicationContext) ctx).close();
	}

}
