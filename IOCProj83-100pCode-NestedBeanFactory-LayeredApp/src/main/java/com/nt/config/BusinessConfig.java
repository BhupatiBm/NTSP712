package com.nt.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages= {"com.nt.dao","com.nt.service"})
@PropertySource(value = "classpath:com/nt/commons/jdbc.properties")
public class BusinessConfig {
	
	@Autowired
	private Environment  env;
	
	
	@Bean
	  public  HikariDataSource  creatHKDs() {
		  HikariDataSource  hkds=null;
		  hkds=new HikariDataSource();
		  hkds.setDriverClassName(env.getProperty("jdbc.driver"));
		  hkds.setJdbcUrl(env.getProperty("jdbc.url"));
		  hkds.setUsername(env.getProperty("jdbc.user"));
		  hkds.setPassword(env.getProperty("jdbc.pwd"));
		  hkds.setMinimumIdle(Integer.parseInt(env.getProperty("jdbc.pool.minIdle")));
		  hkds.setMaximumPoolSize(Integer.parseInt(env.getProperty("jdbc.pool.maxIdle")));
		  System.out.println(env.getProperty("os.name"));
		  System.out.println(env.getProperty("Path"));
		  return hkds;
	  }

}
