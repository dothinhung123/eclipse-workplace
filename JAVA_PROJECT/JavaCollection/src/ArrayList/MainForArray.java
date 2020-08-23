package ArrayList;

import java.util.Scanner;

public class MainForArray {
	private  static ListArray list = new ListArray();
	private static Scanner scanner = new Scanner(System.in); 
	public static void main(String[] args) {
		boolean quit = false;
		int choice;
		while(!quit) {
			System.out.println("Enter you choice");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1 : list.printGroceryList();
			break;
			case 2 : addItem();
			break;
			case 3 : modifyItem();
			break;
			case 4 : removeItem();
			break;
			case 5 : searchForItem();
			break;
			case 6 : 
				quit = true;
				break;
			}
		}
	}
	public static void addItem() {
		System.out.println("Please enter one item");
		list.addList(scanner.nextLine());
	}
	public static void modifyItem() {
		System.out.println("Print index you want to change");
		int position = scanner.nextInt();
		scanner.nextLine();
		System.out.println("Please enter the item");
		String item = scanner.nextLine();
		list.moidifyGroceryList(position-1, item);
	}
	public static void removeItem() {
		System.out.println("Print index you want to change");
		int position = scanner.nextInt();
		list.removeGroceryList(position-1);
		
	}
	public static void searchForItem() {
		System.out.println("Please enter the number");
		String searchItem = scanner.nextLine();
		if(list.findAnItem(searchItem)!=null) {
			System.out.println("Found" + searchItem + " in our list");
		}
		else {
			System.out.print(searchItem  + " is not in the list");
		}
		
	}
}
