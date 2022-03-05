package com.aopDemo.aopDemo;

import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.aopDemo.aopDemo.business.Business1;
import com.aopDemo.aopDemo.business.Business2;
import org.slf4j.Logger;


@SpringBootApplication
public class AopDemoApplication implements CommandLineRunner {

	Logger logger = LoggerFactory.getLogger(this.getClass());
	@Autowired
	Business1 b1;
	@Autowired
	Business2 b2;
	
	public static void main(String[] args) {
		SpringApplication.run(AopDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info(b1.doSomething());
		logger.info(b2.doSomething());
	}

}
