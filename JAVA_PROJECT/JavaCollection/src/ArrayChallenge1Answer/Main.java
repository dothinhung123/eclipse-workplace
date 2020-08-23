package ArrayChallenge1Answer;

import java.util.Scanner;

public class Main {
	private static Scanner scanner = new Scanner(System.in);
	private static MobilePhone moiblephone = new MobilePhone("07737434");
public static void main(String[] args) {
	boolean quit = false;
	startPhone();
	printAction();
	while(!quit) {
		System.out.print("enter action");
		int action = scanner.nextInt();
		scanner.hasNextLine();
		switch(action) {
		case 0:
			System.out.print("Shutting down");
			quit = true;
			break;
		case 1 : 
		moiblephone.printContacts();
		break;
		case 2:
			addNewContact();
		break;
		case 3:
			updateContact();
		break;
		case 4:
			removeContact();
			break;
		case 5 :
			queryContact();
			break;
		case 6 : 
			printAction();
			break;
		}
		
		
	}
}
private static void addNewContact() {
	System.out.println("Enter new contact name");
	String name = scanner.nextLine();
	System.out.println("Enter new contact phone");
	String phone = scanner.nextLine();
	Contact newContact = Contact.createContact(name, phone);
	if(moiblephone.addNewContact(newContact)) {
		System.out.print("New contact added : name=" + name + "phone" + phone);
	}
	else {
		System.out.println("Canot add, " + name + "already on file");
	}
}
private static void updateContact() {
	System.out.println("Enter existing contact name");
	String name = scanner.nextLine();
	Contact existingContactRecord = moiblephone.queryContact(name);
	if(existingContactRecord==null) {
		System.out.println("Contact not found");
		return;
	}
	System.out.print("Enter new contact name");
	String newName = scanner.nextLine();
	System.out.print("Enter new phoneNumber");
	String newPhone = scanner.nextLine();
	Contact newContact = Contact.createContact(newName, newPhone);
	if(moiblephone.updateContact(existingContactRecord, newContact)) {
		System.out.println("Sucessfully updated recored");
		
	}
	else {
		System.out.println("Error updating record");
	}
	
}
private static void removeContact() {
	System.out.println("Enter exisitng contact name:");
	String name = scanner.nextLine();
	Contact existingContactRecord = moiblephone.queryContact(name);
	if(existingContactRecord==null) {
		System.out.println("Contact not found");
		return ;
		
	}
	if(moiblephone.removeContact(existingContactRecord)) {
		System.out.println("Sucessfully deleted");
	}else {
		System.out.println("Error deleteign cotnact");
	}
	
	
}
private static void queryContact() {
	System.out.println("Enter exisitng contact name:");
	String name = scanner.nextLine();
	Contact existingContactRecord = moiblephone.queryContact(name);
	if(existingContactRecord==null) {
		System.out.println("Contact not found");
		return ;
		
	}
	System.out.print("name" + existingContactRecord.getName() + "phone number is" + existingContactRecord.getPhone());
	
	
	
}
private static void startPhone() {
	System.out.println("Starting phone ...");
	
}
private static void printAction() {
	
}
}
