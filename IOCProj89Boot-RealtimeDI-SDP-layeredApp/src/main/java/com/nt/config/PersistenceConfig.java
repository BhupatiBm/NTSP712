package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import com.mchange.v2.c3p0.ComboPooledDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersistenceConfig {
	@Autowired
	private Environment env;
	
	/*@Bean(name="c3P0Ds")
	public  DataSource   createDs() throws Exception{
		System.out.println("PersistenceConfig.createDs(-)");
		ComboPooledDataSource c3P0Ds=null;
		c3P0Ds=new ComboPooledDataSource();
		c3P0Ds.setDriverClass(env.getProperty("spring.datasource.driver-class-name"));
		c3P0Ds.setJdbcUrl(env.getProperty("spring.datasource.url"));
		c3P0Ds.setUser(env.getProperty("spring.datasource.username"));
		c3P0Ds.setPassword(env.getProperty("spring.datasource.password"));
		return c3P0Ds;
	}*/

}
