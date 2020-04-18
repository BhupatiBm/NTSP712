package com.nt.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.datasource.DriverManagerDataSource;



@Configuration
@ComponentScan(basePackages = "com.nt.dao")
@PropertySource({"classpath:com/nt/commons/jdbc1.properties","classpath:com/nt/commons/jdbc2.properties"})
public class PersistenceConfig {
	@Autowired
	private Environment env;
	
	@Bean(name="drds")
	public  DataSource createDS() {
	
		DriverManagerDataSource ds=null;
		ds=new DriverManagerDataSource();
		ds.setDriverClassName(env.getProperty("jdbc.driver"));
		ds.setUrl(env.getProperty("jdbc.url"));
		ds.setUsername(env.getProperty("jdbc.username"));
		ds.setPassword(env.getProperty("jdbc.password"));
		return ds;
	}

}
