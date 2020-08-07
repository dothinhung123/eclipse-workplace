package ArrayChallenge1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MobilePhone {
	private List<Contacts> contact = new ArrayList<Contacts>();
	public void listContact() {
		for(Contacts c : contact) {
			System.out.print(c);
		}
	}
	public void addContact(Contacts c) {
		contact.add(c);
	}
	public void modifyContact(String name) {
		Contacts c = findByString(name);
		int position = contact.indexOf(c);
		contact.set(position, c);
		
	}
	public Contacts findByString(String name) {
		for(Contacts c : contact) {
			if(name ==c.getName()) {
				return c;
			}
			
		}
		return null;
		
	}
	public void removeContact(int position) {
		contact.remove(position);
	}
	public Contacts searchContact(Contacts c) {
	   int position = contact.indexOf(c);
	   if(position>=0) {
		   return contact.get(position);
	   }
	   return null;
	}
	
	

}
