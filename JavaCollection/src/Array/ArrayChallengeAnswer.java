package Array;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayChallengeAnswer {
private static Scanner scanner = new Scanner(System.in);
public static void main(String[] args) {
	int[] myIntegers = getIntegers(6);
	printArray(myIntegers);
	
}
public static int[]  getIntegers(int capacity) {
	int[] a= new int[capacity];
	System.out.print("Print integer");
	for(int i = 0 ;i<capacity;i++) {
		a[i] = scanner.nextInt();
	
	}
	return a;
}
public static void printArray(int[] array) {
for(int i = 0 ;i<array.length;i++) {
	System.out.print(array[i]);
	
}

}
public static int[] sortInteger(int[] arr) {
//	int[] sortedArray = new int[arr.length];
//	for(int i = 0 ;i<arr.length;i++) {
//		sortedArray[i] = arr[i];
//	}
	int[] sortedArray = Arrays.copyOf(arr, arr.length);
	boolean flag = true;
	int temp;
	while(flag) {
		// it will swap element 
		//0 : 50
		//1	:160
		//2 :40
		//3 : 80
		// swapping one 
		//is 160 >50? yes => swap
		//0 : 160
		//1	:50
		//2 :40
		//3 : 80
		// is 40>50? no
		// is 80>40 ? yes => swap
		//0 : 160
		//1	:50
		//2 :80
		//3 : 40
		// is 160>50 yes
		// is 50<80? yes => swap
		//0 : 160
		//1	:80
		//2 :50
		//3 : 40
		flag = false;
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
