package Array;

import java.util.Scanner;

public class ArrayChallenge1 {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = getIntegers(5);
		arr =sortIneger(arr);
		printArray(arr);
		
	}
	public static int[] getIntegers(int capacity) {
		int[] array = new int[capacity];
		for(int i =0 ;i<array.length;i++) {
			System.out.print("Print the array");
			array[i] = scanner.nextInt();
		}
		return array;
		
	}
	public static void printArray(int[] arr) {
		for(int i =0 ;i<arr.length;i++) {
			System.out.print(arr[i]);
		}
	}
	public static int[] sortIneger(int[] arr) {
		//decending
		for(int i = 0 ;i<arr.length;i++) {
			for(int j = i+1;j<arr.length;j++) {
				int temp = 0;
				if(arr[i]<arr[j]) {
					temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		return arr;
//		// not decending
//				for(int i = 0 ;i<arr.length;i++) {
//					for(int j = i+1;j<arr.length;j++) {
//						int temp = 0;
//						if(arr[i]>arr[j]) {
//							temp = arr[i];
//							arr[i] = arr[j];
//							arr[j] = temp;
//						}
//					}
//				}
//				return arr;
		
		
	}
	public static int[] sortIntegerAnswer(int[] arr) {
int[] sortedArray = new int[arr.length];
for(int i = 0 ;i<sortedArray.length;i++) {
	sortedArray[i] = arr[i];
}
boolean flag= true;
int temp;
while(flag) {
	flag =false;
	for(int i = 0 ;i<sortedArray.length-1;i++) {
		if(sortedArray[i]<sortedArray[i+1]) {
			temp = sortedArray[i];
			sortedArray[i] = sortedArray[i+1];
			sortedArray[i+1] = temp;
			flag = true;
		}
	}
}
return sortedArray;
	}
}
