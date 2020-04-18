package com.nt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.nt.dao.DepositeDAo;
import com.nt.dao.WithdrawDAo;

@Repository("bankService")
public class BankServiceImpl implements BankService {
	@Autowired
	DepositeDAo depDao;
	@Autowired
	WithdrawDAo withDao;
	@Override
	@Transactional(propagation = Propagation.REQUIRED)
	public String monyTransfer(int srcacno, int destAcno, float amount) {
	boolean res1,res2;
	res1=withDao.withdraw(srcacno, amount);
	res2=depDao.deposite(destAcno, amount);
	if(res1==false || res2==false)
		throw new RuntimeException("money rollbacked");
	else
		return "mony transfered sucessfully";
	}

}
