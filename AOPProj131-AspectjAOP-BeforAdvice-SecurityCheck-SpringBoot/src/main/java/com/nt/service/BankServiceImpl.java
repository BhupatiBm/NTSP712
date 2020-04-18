package com.nt.service;

import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dao.BankDAO;
@Component("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	BankDAO dao;
	public BankServiceImpl(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	public String withdraw(int acno, float amount) {
		int count=0;
		count=(int) dao.withdraw(acno, amount);
		
		if(count==0)
			return "Mony Withdarw failed";
		else
			return "<---------------Mony withraw sucessfully------------>";
	}

	@Override
	public String deposite(int acno, float amount) {
		int count=0;
		
		count=(int) dao.depostie(acno, amount);
		if(count==0)
			return "Mony not deposited Invalid account";
		else
			return "<-------Mony deposited------>";
	}

}
