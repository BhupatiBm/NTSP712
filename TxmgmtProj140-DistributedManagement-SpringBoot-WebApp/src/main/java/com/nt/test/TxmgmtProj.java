package com.nt.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Import;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.nt.cfgs.application_bean;
import com.nt.service.BankService;

@SpringBootApplication
@Import(application_bean.class)
public class TxmgmtProj {
	public static void main(String[] args) {
		ApplicationContext ctx=null;
		BankService proxy=null;
		ctx=SpringApplication.run( TxmgmtProj.class, args);
		proxy=ctx.getBean("bankService",BankService.class);
		try {
			System.out.println(proxy.monyTransfer(102, 1111, 53));
		}
		catch(Exception e) {
			e.printStackTrace();
		}

	}
}