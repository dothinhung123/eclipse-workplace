package Array;

import java.util.Scanner;

public class ArrayBasic {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
//		int[] myArray = new int[10];
//		for(int i = 0 ;i<myArray.length;i++) {
//			myArray[i] = i*10;
//			
//		}
//		for(int i = 0;i<myArray.length;i++) {
//			System.out.println( "value" + myArray[i]);
//		}
//		printArray(myArray);
		double[] array= getNumbers(10);
		printArray(array);
		System.out.print(calculateAverage(array));
		
	}
	public static void printArray(double[] arr) {
		for(int i = 0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
	}
	public static double[] getNumbers(int capacity) {
		double[] number = new double[capacity];
		for(int i = 0 ;i<number.length;i++) {
			number[i] = scanner.nextInt();
			
		}
		return number;
		
	}
	public static double calculateAverage(double[] array) {
		double a = 0;
		for(int i = 0;i<array.length;i++){
			a +=array[i];
		}
		return a;
			
	}
}
