package com.nt.cfgs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@EnableTransactionManagement()
public class aop {
	@Autowired
	private DataSource ds;
	
	@Bean(name="txMgr")
	public DataSourceTransactionManager createTxmgr() {
		return new DataSourceTransactionManager(ds);
	}

}
