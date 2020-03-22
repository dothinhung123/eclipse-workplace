package com.example.demo.scope;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5MinutesApplication {
private static Logger LOGGER = LoggerFactory.getLogger(Spring5MinutesApplication.class);
	public static void main(String[] args) {
		
	 ApplicationContext applicationContext = SpringApplication.run(Spring5MinutesApplication.class, args);
	 PersonDAO personDao1 = applicationContext.getBean(PersonDAO.class);
	 PersonDAO personDao2 = applicationContext.getBean(PersonDAO.class);
	 

		
		
	}


}
