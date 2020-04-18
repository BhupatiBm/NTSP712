package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Import;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.cfgs.ApplicationConfig;
import com.nt.dao.BankDAO;

@Service("bankService")

public class BankServiceImpl implements BankServices {
	@Autowired
	private BankDAO dao;
	
	@Transactional(propagation = Propagation.REQUIRED )
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
