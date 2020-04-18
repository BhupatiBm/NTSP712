package com.nt.cfgs;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.transaction.jta.JtaTransactionManager;

import com.atomikos.icatch.jta.UserTransactionImp;
import com.atomikos.icatch.jta.UserTransactionManager;

@Configuration
public class aop_bean {
	
	@Bean(name="atomikosTxMgr")
	public UserTransactionManager createDtxmgr() {
		return new UserTransactionManager();
	}
	
	@Bean(name="atomikosUT")
	public UserTransactionImp createDtxuser() {
		return new UserTransactionImp();
	}
	
	@Bean(name="dtxMgr")
	public JtaTransactionManager createJtaTxmgr() {
		JtaTransactionManager jt=new JtaTransactionManager();
		jt.setUserTransaction(createDtxuser());
		jt.setTransactionManager(createDtxmgr());
		return jt;
	}
}
