package com.nt.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;
@Component("depositeDao")
public class DepositeDAoImpl implements DepositeDAo {
	private static final String DEPOSITE_QUERRY="UPDATE DAOBANK SET BALANCE=BALANCE+? WHERE ACCNO=?";
	@Autowired @Qualifier("mysqlJt")
	public JdbcTemplate mysqlJt;
	@Override
	public boolean deposite(int acno, float ammount) {
		int count=0;
		count=mysqlJt.update(DEPOSITE_QUERRY, ammount,acno);
		if(count==0)
			return false;
		else
			return true;
	}

}
