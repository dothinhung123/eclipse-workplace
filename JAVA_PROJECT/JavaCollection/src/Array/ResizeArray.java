package Array;

import java.util.Scanner;

public class ResizeArray {
private static Scanner s  = new Scanner(System.in);
private static int[] baseData = new int[10];

public static void main(String[] args) {
	System.out.println("Enter 10 Integers");
	getInput();
	printArray(baseData);
	resizeArray();
//	System.out.print("Enter 12 Integers");
//	getInput();
	printArray(baseData);
	baseData[10] = 43;
	baseData[11] =44;
	printArray(baseData);
}
private static void getInput() {
	for(int i = 0 ;i<baseData.length;i++) {
		baseData[i] = s.nextInt();
	}
}
private static void printArray(int[] arr) {
	for(int i = 0 ;i<arr.length;i++) {
		System.out.print(arr[i] + " ");
		System.out.println();

	}
}
private static void resizeArray() {
	int[] original = baseData;
	baseData = new int[12];
	for(int i = 0 ;i<original.length;i++) {
		baseData[i] = original[i];
	}
}
}
