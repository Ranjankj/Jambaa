package com.ranjan.database.jdbctutorial;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.ranjan.database.jdbctutorial.jdbcdao.PersonJdbcDao;

@SpringBootApplication
public class JdbctutorialApplication implements CommandLineRunner{
	@Autowired
	PersonJdbcDao dao;
	
	Logger logger = LoggerFactory.getLogger(this.getClass());
	public static void main(String[] args) {
		SpringApplication.run(JdbctutorialApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Data ==> {}", dao.findAll());
	}

}
