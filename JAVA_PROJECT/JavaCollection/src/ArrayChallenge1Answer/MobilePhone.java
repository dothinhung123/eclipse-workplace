package ArrayChallenge1Answer;

import java.util.ArrayList;
import java.util.List;

public class MobilePhone {
	private String myNumber;
	private List<Contact> contacts ;
	
	public MobilePhone(String myNumber) {
		this.myNumber=myNumber;
		this.contacts = new ArrayList<Contact>();
	}
	public boolean addNewContact(Contact contact) {
	  if(findContact(contact.getName())>=0) {
		  System.out.print("Contact is arleady on file");
		  return false;
	  }
	  contacts.add(contact);
	  return true;
		
	}
	public void printContacts() {
		System.out.print("Contact list");
		for(int i = 0 ;i<this.contacts.size();i++) {
			System.out.println((i+1) + "." + this.contacts.get(i).getName() + " " +this.contacts.get(i).getPhone());
		}
	}
	public boolean removeContact(Contact contact) {
		int foundPosition = findContact(contact);
		if(foundPosition<0) {
			System.out.print(contact.getName() + " was not found");
			return false;
		}
		this.contacts.remove(contact);
		System.out.print(contact.getName() +"was deleted");
		return true;
	}
	private int findContact(Contact contact) {
		return this.contacts.indexOf(contact);
	}
	public boolean updateContact(Contact oldContact, Contact newContact) {
		int foundPosition = this.contacts.indexOf(oldContact);
		if(foundPosition<0) {
			System.out.println(oldContact.getName()+" was not found");
			return false;
		}
		else if(findContact(newContact.getName())!=-1) {
			System.out.println("Contact with name" + newContact.getName() + " arealdy exists . update was not sucesfsully");
			return false;
			
		}
		this.contacts.set(foundPosition, newContact);
		System.out.print(oldContact.getName() +" was replaced with" + newContact.getName());
		return true;
	}
	private int findContact(String name) {
//		for(Contact c:contacts) {
//			if(c.getName().equals(name)) {
//				return contacts.indexOf(c);
//				
//			}
//		}
//		return -1;
		for(int i =0;i<contacts.size();i++) {
			Contact c =  this.contacts.get(i);
			if(c.getName().equals(name)) {
				return i;
			}
		}
		return -1;
	}
	public String queryContact(Contact contact) {
		if(findContact(contact)>=0) {
			return contact.getName();
			
		}
		return null;
	}
	public Contact queryContact(String name) {
		int position = findContact(name);
		if(position>=0) {
			return this.contacts.get(position);
		}
		return null;
	}
}
