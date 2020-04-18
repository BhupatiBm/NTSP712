package com.nt.service;

import com.nt.dao.BankDAO;

public class BankServiceImpl implements BankServices {
	
	private BankDAO dao;
	
	public BankServiceImpl(BankDAO dao) {
		this.dao=dao;
	}

	@Override
	public String transferMoney(int srcAcno, int destAcno, float amount)throws IllegalAccessException {
		int result1=0,result2=0;
		result1=dao.withdraw(srcAcno, amount);
		 result2=dao.deposite(destAcno, amount);
//		try {
//			Thread.sleep(20000);
//		}
//		catch(Exception e) {
//			e.printStackTrace();
//		}
		if (result1==0 || result2==0) {
			throw new IllegalArgumentException("Mony Transfer Failed****(amount rollbacked)");
		}
		else {
			return "false";
		}
	}

}
