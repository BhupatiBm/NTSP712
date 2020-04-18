package com.nt.service;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankService {
	BankDAO dao;
	

	public BankServiceImpl(BankDAO dao) {
		this.dao = dao;
	}

	@Override
	public String withdraw(int acno, float amount) {
		int count=0;
		count=(int)dao.withdraw(acno, amount);
		
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
