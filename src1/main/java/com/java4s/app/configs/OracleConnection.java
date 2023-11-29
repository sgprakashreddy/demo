package com.java4s.app.configs;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.env.Environment;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

//@Configuration
public class OracleConnection {
	
	/*
	 * @Autowired private Environment env;
	 */
	
	/*
	 * @Bean
	 * 
	 * @Primary public DataSource getDataSource() {
	 * 
	 * DriverManagerDataSource driverManagerDataSource = new
	 * DriverManagerDataSource();
	 * driverManagerDataSource.setDriverClassName(env.getProperty(
	 * "spring.oracledatasource.driver-class-name"));
	 * driverManagerDataSource.setUrl(env.getProperty("spring.oracledatasource.url")
	 * ); driverManagerDataSource.setUsername(env.getProperty(
	 * "spring.oracledatasource.username"));
	 * driverManagerDataSource.setPassword(env.getProperty(
	 * "spring.oracledatasource.password")); return driverManagerDataSource; }
	 */
	
	@Bean
	public JdbcTemplate jdbcTemplateprimary(@Qualifier("oracledatasource") DataSource ds) {
		return new JdbcTemplate(ds);
	}
	

}
