package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	public SortAlgorithm sortAlgorithm;
    public BinarySearchImpl( SortAlgorithm sortAlgorithm) {
    	super();
    	this.sortAlgorithm = sortAlgorithm;
    }
	
	public int binarySearch(int[] numbers, int numberToSort) {
		SortAlgorithm bubleSort = new BubbleSortAlgorithm();
		int[] sortedNumber = bubleSort.sort(numbers);
		return 3;
		
	}

}
