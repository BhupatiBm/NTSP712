package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;
@Repository("withrawDao")
public class WithdrawDAoImpl implements WithdrawDAo {
	private static final String WITHDRAW_QUERRY="UPDATE DAOBANK SET BALANCE=BALANCE-? WHERE ACCNO=?";
    @Autowired @Qualifier("oraJt")
	public JdbcTemplate oraJt;
	@Override
	public boolean withdraw(int acno, float ammount) {
		int count=0;
		count=oraJt.update(WITHDRAW_QUERRY, ammount,acno);
		if(count==0)
			return false;
		else
			return true;
	}

}
