//package ArrayList;
//
//import java.util.Scanner;
//
//public class Main {
//	private static Scanner scanner = new Scanner(System.in);
//	private static GroceyList groceyList = new GroceyList();
//	public static void main(String[] args) {
//		boolean quit = false;
//		int choice = 0 ;
//		while(!quit) {
//			System.out.print("Enter you rhcoice");
//			choice = scanner.nextInt();
//			scanner.nextLine();
//			switch(choice) {
//			case 0: 
//				printInstruction();
//				break;
//			case 1: 
//				groceyList.printGroceryList();
//			case 2: addItem();
//			break;
//			case 3 : modifyItem();
//			break;
//			case 4 : removeItem();
//			break;
//			case 5 : searchForItem();
//			break;
//			case 6 : 
//				quit = true;
//				break;
//			}
//			
//				
//			
//		}
//	}
//	public static void printInstruction() {
//		System.out.print("Intruction");
//		
//	}
//	public static void addItem() {
//		groceyList.addGroceryItem(scanner.nextLine());
//	}
//	public static void modifyItem() {
//			System.out.print("Print the position");
//			int position = scanner.nextInt();
//			System.out.print("Print the item");
//			String item = scanner.nextLine();
//			groceyList.modifyGroceryItem(position-1,item);
//			
//		
//	}
//	public static void removeItem() {
//		System.out.print("Enter item number no");
//		int itemNo = scanner.nextInt();
//		scanner.hasNextLine();
//		groceyList.removeGroceryItem(itemNo);
//		
//	}
//	public static void searchForItem() {
//		System.out.print("Item to search for : ");
//		String searchItem = scanner.nextLine();
//		if(groceyList.findItem(searchItem)!=null) {
//			System.out.println("Found" + searchItem + " in our grocery list");
//			
//		}
//		else {
//			System.out.println(searchItem + " is not in the shopping list");
//		}
//	}
//}
