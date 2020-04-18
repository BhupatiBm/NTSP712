package com.nt.cfgs;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class persistanceConfig {
	
	@Bean
	public static  HikariDataSource dataSource() {
		HikariDataSource ds=new HikariDataSource();
		ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
		ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
		ds.setUsername("system");
		ds.setPassword("manager");
		return ds;
		
	}
	
	@Bean(name = "jt")
	public JdbcTemplate CreateTemplet() {
		return new JdbcTemplate(dataSource());
	}

}
