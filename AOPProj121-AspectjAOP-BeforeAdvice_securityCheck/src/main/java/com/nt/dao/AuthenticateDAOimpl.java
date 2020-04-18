package com.nt.dao;

import org.springframework.jdbc.core.JdbcTemplate;

import com.nt.model.UserDetails;

public class AuthenticateDAOimpl implements AuthenticateDAO{
	private  static final String  AUTH_QUERY="SELECT COUNT(*) FROM USERLIST WHERE UNAME=? AND PWD=?";
	private  JdbcTemplate jt;
	
	public AuthenticateDAOimpl(JdbcTemplate jt) {
		this.jt = jt;
	}



	@Override
	public int authenticate(UserDetails detail) {
		// TODO Auto-generated method 
		int count=0;
		count=jt.queryForObject(AUTH_QUERY, Integer.class, detail.getUserName(),detail.getUserPassword());
		return count;
	}
	

}
