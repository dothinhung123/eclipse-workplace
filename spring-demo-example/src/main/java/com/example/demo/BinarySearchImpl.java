package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearchImpl {
	@Autowired
	private SortAlgorithm sortAlgorithm;

	public BinarySearchImpl(SortAlgorithm sortAlgorithm) {
		super();
		this.sortAlgorithm = sortAlgorithm;
	}

public int binarySearch(int[]numbers,int numberToSort) {
	//implementing sorting logic
	// Bubble Sort Alogrithm
	//Quick Sort Algorithm
	//Search the array
	
    SortAlgorithm bubbleSort = new BubbleSortAlgorithm();
    int[] sortNumbers = bubbleSort.sort(numbers);
	
	return 3;
	
}
}
