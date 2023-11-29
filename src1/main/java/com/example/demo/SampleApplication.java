package com.example.demo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

@SpringBootApplication
public class SampleApplication implements CommandLineRunner {

	private static final Logger log = LoggerFactory.getLogger(SampleApplication.class);
	
	@Autowired
	JdbcTemplate jdbcTemplate;
	
//	@Autowired
	private CustomerRepository customerRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(SampleApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		startCustomerApp();
		
	}

	private void startCustomerApp() {
		// TODO Auto-generated method stub
		
        log.info("[COUNT]");
        log.info("{}", customerRepository.count());
		
	}

	
	
	
}
