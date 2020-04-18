package com.nt.cfg;

import org.apache.commons.dbcp2.BasicDataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;
import org.springframework.jdbc.core.JdbcTemplate;

@Configuration
@ComponentScan(basePackages="com.nt.advice,com.nt.dao,com.nt.manager,com.nt.service")
@EnableAspectJAutoProxy
public class AopConfig {
	
	@Bean
	public BasicDataSource basicDS() {
		BasicDataSource bds=null;
		bds=new BasicDataSource();
		bds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		bds.setUrl("jdbc:oracle:thin:@localhost:1521:xe");
		bds.setUsername("system");
		bds.setPassword("manager");
		return bds;
	}
	
	@Bean
	public JdbcTemplate adbcTemp() {
		JdbcTemplate jt=null;
				jt=new JdbcTemplate(basicDS());
				return jt;
				
		}

}
