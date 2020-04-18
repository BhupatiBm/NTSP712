package com.nt.cfgs;

import java.util.Properties;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.atomikos.jdbc.AtomikosDataSourceBean;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class persistance_bean {
	
	@Bean(name = "oraDs")
	public AtomikosDataSourceBean oraDS() {
		AtomikosDataSourceBean ds=null;
		Properties prp=null;
		ds=new AtomikosDataSourceBean();
		prp=new Properties();
		ds.setUniqueResourceName("oraXA");
		ds.setXaDataSourceClassName("oracle.jdbc.xa.client.OracleXADataSource");
		prp.put("databaseName","xe");
		prp.put("user", "system");
		prp.put("password","manager");
		prp.put("URL","jdbc:oracle:thin:@localhost:1521:xe");
		ds.setXaProperties(prp);
		return ds;
		
	}
	
	@Bean(name = "mysqlDs")
	public AtomikosDataSourceBean mysqlDs() {
		AtomikosDataSourceBean ds=null;
		Properties prp=null;
		ds=new AtomikosDataSourceBean();
		prp=new Properties();
		ds.setUniqueResourceName("mysqlXA");
		ds.setXaDataSourceClassName("com.mysql.cj.jdbc.MysqlXADataSource");
		prp.put("databaseName","spring");
		prp.put("user", "root");
		prp.put("password","root");
		prp.put("URL",""
				+ "");
		ds.setXaProperties(prp);
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
