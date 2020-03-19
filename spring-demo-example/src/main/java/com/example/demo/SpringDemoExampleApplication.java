package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringDemoExampleApplication {
// what are bean
// what are the dependencies of a bean
	// where search for a bean => no need 
	public static void main(String[] args) {
//		BinarySearchImpl binarySearch = new BinarySearchImpl(new QuickSortAlgorithm());
//		int result = binarySearch.binarySearch(new int[] {1,3,4,5},4);
//		System.out.println(result);
//		SpringApplication.run(SpringDemoExampleApplication.class, args);
		
		ApplicationContext applicationContext= SpringApplication.run(SpringDemoExampleApplication.class, args);
		BinarySearchImpl binarySearch = applicationContext.getBean(BinarySearchImpl.class);
		int result = binarySearch.binarySearch(new int[] {14,342,4},4);
		System.out.println(result);
		
	}

}
