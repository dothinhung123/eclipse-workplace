package Array;

import java.util.Arrays;
import java.util.Scanner;

public class MinMaxChallenge {
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
		int[] arr = getInteger(5);
		System.out.print(max(arr));
	}
	public static int[] getInteger(int capacity) {
		int[] arr = new int[capacity];
		System.out.print("Please print arr");
		for(int i = 0 ;i<arr.length;i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
		
	}
	public static int MinValue(int[] arr) {
	int min = Integer.MAX_VALUE;
	for(int i = 0 ;i<arr.length;i++) {
		int value = arr[i];
		if(min>value) {
			min = value;
		}
	}
	return min;
	}
	// can find like this or like this
	public static int min(int[] arr) {
		if(arr ==null||arr.length<0 ) {
			throw new IllegalArgumentException("This array is null" + Arrays.toString(arr));
		}
		int min = arr[0];
		for(int i = 1 ;i<arr.length;i++) {
			if(arr[i]<min) {
				min = arr[i];
			}
		}
		return min;
			
			
	}
	public static int max(int[] arr) {
		if(arr.length<0 || arr ==null) {
			throw new IllegalArgumentException("This arra is unvalid" + Arrays.toString(arr));
			
		}
		int max = arr[0];
		for(int i = 1; i<arr.length;i++) {
			if(arr[i]>max) {
				max = arr[i];
			}
		}
		return max;
	}

}
