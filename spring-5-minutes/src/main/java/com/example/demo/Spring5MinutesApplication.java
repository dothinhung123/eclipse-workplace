package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Spring5MinutesApplication {
	// what are the beans?
			// what are the depencies of a bean
			// Where to search for bean=>no need

	public static void main(String[] args) {
		
	 ApplicationContext applicationContext = SpringApplication.run(Spring5MinutesApplication.class, args);
	 BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
	 int result = binarySearch.binarySearch(new int[] { 1,43,3},4);
	 System.out.println(result);
	 

		
		
	}


}
