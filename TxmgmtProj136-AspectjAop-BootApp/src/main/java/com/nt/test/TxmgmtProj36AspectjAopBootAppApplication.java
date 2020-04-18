package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.AbstractApplicationContext;

import com.nt.cfgs.ApplicationConfig;
import com.nt.service.BankServices;

@SpringBootApplication
@Import(ApplicationConfig.class)
public class TxmgmtProj36AspectjAopBootAppApplication {
			public static void main(String[] args) {
				ApplicationContext ctx=null;
				BankServices proxy=null;
				ctx=SpringApplication.run(TxmgmtProj36AspectjAopBootAppApplication.class, args);
				proxy=ctx.getBean("bankService",BankServices.class);
				
				try {
				System.out.println(proxy.transferMoney(102, 1001, 520));
				}
				catch(IllegalAccessException  iae) {
					iae.printStackTrace();
				}
				((AbstractApplicationContext) ctx).close();
			}

		}



