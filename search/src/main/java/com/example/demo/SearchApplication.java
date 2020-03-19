package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SearchApplication {

	public static void main(String[] args) {
		BinarySearch binarySearch = new BinarySearch();
		int result = binarySearch.binarySearch();
		SpringApplication.run(SearchApplication.class, args);
	}

}
