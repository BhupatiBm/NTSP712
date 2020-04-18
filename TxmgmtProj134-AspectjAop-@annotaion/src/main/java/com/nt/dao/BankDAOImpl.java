package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class BankDAOImpl implements BankDAO {
	private static final String WITHDRAW_QUERRY="UPDATE DAOBANK SET BALANCE=BALANCE-? WHERE ACCNO=?" ;
	private static final String DEPOSITE_QUERRY="UPDATE DAOBANK SET BALANCE=BALANCE+? WHERE ACCNO=?" ;
	@Autowired
	private JdbcTemplate jt;
	
	@Override
	public int withdraw(int acno, float amount) {
		int count=0;
		count=jt.update(WITHDRAW_QUERRY, amount,acno);
		return count;
	}

	@Override
	public int deposite(int acno, float amount) {
		int count=0;
		count=jt.update(DEPOSITE_QUERRY, amount,acno);
		return count;
	}

}
