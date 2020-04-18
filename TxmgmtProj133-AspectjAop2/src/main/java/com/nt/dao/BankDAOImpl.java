package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

public class BankDAOImpl implements BankDAO {
	private static final String WITHDRAW_QUERRY="UPDATE DAOBANK SET BALANCE=BALANCE-? WHERE ACCNO=?" ;
	private static final String DEPOSITE_QUERRY="UPDATE DAOBANK SET BALANCE=BALANCE+? WHERE ACCNO=?" ;
	
	private JdbcTemplate jt;
	
	public BankDAOImpl(JdbcTemplate jt) {
		System.out.println("BankDAOImpl.BankDAOImpl()");
		this.jt=jt;
	}
	
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
