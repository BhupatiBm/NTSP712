package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component
public class BankDAOImpl implements BankDAO {
	private  static final String WITHDRAW_QUERY="UPDATE AOP_ACCOUNT SET BALANCE=BALANCE-? WHERE ACNO=?";
	private  static final String DEPOSITE_QUERY="UPDATE AOP_ACCOUNT SET BALANCE=BALANCE+? WHERE ACNO=?";
	
	@Autowired
	private  JdbcTemplate jt;

	public BankDAOImpl(JdbcTemplate jt) {
		this.jt = jt;
	}
	@Override
	public float depostie(int acno, float amount) {
		int count=0;
		count=jt.update(DEPOSITE_QUERY,amount,acno);
		return count;
	}

	@Override
	public float withdraw(int acno, float amount) {
		int count=0;
		count=jt.update(WITHDRAW_QUERY,amount,acno);
		return count;
	}

}
