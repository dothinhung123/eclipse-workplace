package Arraylist2;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	private static ListOne list = new ListOne();
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		int choice;
		boolean quit = false;
		while(!quit) {
			System.out.print("Please enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1: printItem();
			break;
			case 2: addItem();
			break;
			case 3: modifyItem();
			break;
			case 4: removeItem();
			break;
			case 5: searchItem();
			break;
			case 6:
				quit = true;
				break;
				
			}
		}
	}
	public static void printItem() {
		list.printList();
	}
	public static void addItem() {
		System.out.print("Please print the item" + " ");
		String item = scanner.nextLine();
		list.addItem(item);
	}
	public static void modifyItem() {
		System.out.print("Print out the position");
		int position = scanner.nextInt();
		scanner.nextLine();
		System.out.print("Please print out the item");
		String item = scanner.nextLine();
		list.modifyItem(position, item);
	}
	public static void removeItem() {
		System.out.print("Please print the position");
		int position = scanner.nextInt();
		list.removeItem(position);
	}
	public static void searchItem() {
		System.out.print("Please enter the value");
		String searchItem = scanner.nextLine();
		list.findItem(searchItem);
	}
	public static void processArrayList() {
		ArrayList<String> a = new ArrayList<String>();
		a.addAll(list.getList());
		ArrayList<String> b= new ArrayList<String>(list.getList());
		String[] myArray = new String[list.getList().size()];
		myArray = list.getList().toArray(myArray);
	}
}

