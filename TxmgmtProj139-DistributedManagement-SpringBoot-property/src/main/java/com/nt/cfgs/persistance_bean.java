package com.nt.cfgs;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.atomikos.jdbc.AtomikosDataSourceBean;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class persistance_bean {
	
	@Bean(name = "oraDs")
	@ConfigurationProperties(prefix ="jta.atomikos.datasource.first")
	public AtomikosDataSourceBean oraDS() {
		AtomikosDataSourceBean ds=null;
		ds=new AtomikosDataSourceBean();
		return ds;
		
	}
	
	@Bean(name = "mysqlDs")
	@ConfigurationProperties(prefix = "jta.atomikos.datasource.second")
	public AtomikosDataSourceBean mysqlDs() {
		AtomikosDataSourceBean ds=null;
		ds=new AtomikosDataSourceBean();
		return ds;
		
	}
	
	@Bean(name="oraJt")
	public JdbcTemplate oraJT() {
		return new JdbcTemplate(oraDS());
	}
	
	@Bean(name="mysqlJt")
	public JdbcTemplate mysqlJT() {
		return new JdbcTemplate(mysqlDs());
	}



}
