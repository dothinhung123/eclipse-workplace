package ArrayChallenge1;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone phone = new MobilePhone();
	private static Contacts contact  = new Contacts();
	
	public static void main(String[] args) {
		int choice ;
		boolean quit = false;
		while(!quit) {
			System.out.print("Please enter your choice");
			choice = scanner.nextInt();
			scanner.nextLine();
			switch(choice) {
			case 1 : addItem();
			break;
			case 2 : modifyItem();
			break;
			case 3 : removeItem();
			break;
			case 4 : searchItem();
			break;
			case 5 : printItem();
			break;
			default : 
				quit = true;
				break;
			}
		}
	}
	private static void printItem() {
		phone.listContact();
		
	}
	private static void addItem() {
		System.out.print("Please enter the name ");
		String name = scanner.nextLine();
		System.out.print("Please enter the phone");
		String phoneNumber = scanner.nextLine();
		contact.setName(name);
		contact.setNumber(phoneNumber);
		phone.addContact(contact);
	}
	private static void modifyItem() {
		System.out.print("Please enter the name");
		String name = scanner.nextLine();
		
		
		
	}
	private static void removeItem() {
		
	}
	private static void searchItem() {
		
	}
	
	
	

}
