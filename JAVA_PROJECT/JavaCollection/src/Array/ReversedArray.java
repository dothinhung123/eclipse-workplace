package Array;

public class ReversedArray {
public static void main(String[] args) {
	int[] arr = new int[] {34,34,24,3,40};
	ReverseArray(arr);
	for(int i = 0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	

}
public static int[] ReverseArray(int[] arr) {
	int maxIndex = arr.length-1;
	int halfLength= arr.length/2;
	int temp ;
	for(int i = 0 ;i<halfLength;i++) {
		temp = arr[i];
		arr[i] = arr[maxIndex-i];
		arr[maxIndex-i]=temp;
	
	}
	return arr;
	
	
}
}