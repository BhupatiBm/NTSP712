package com.nt.manager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nt.dao.AuthenticateDAO;
import com.nt.model.UserDetails;
@Component("authManager")
public class AuthenticateManager {
	private ThreadLocal<UserDetails> ThreadLocal=new ThreadLocal<UserDetails>();
	
	@Autowired
	AuthenticateDAO dao=null;
	public AuthenticateManager(AuthenticateDAO dao) {
		this.dao = dao;
	}
	
	public void signIn(String uid,String pwd) {
		UserDetails details=null;
		details=new UserDetails();
		details.setUserName(uid);
		details.setUserPassword(pwd);
		ThreadLocal.set(details);
	}
	
	public void signOut() {
		ThreadLocal.remove();
	}
	
	public boolean validateUser() {
		UserDetails details=null;
		int count=0;
		details=ThreadLocal.get();
		count=dao.authenticate(details);
		if(count!=0)
			return true;
		else
			return false;
	}
	
	
}
