package Arraylist2;

import java.util.ArrayList;

public class ListOne {
	private ArrayList<String> list = new ArrayList<String>();
	public void printList () {
		System.out.print("The array includes");
		for(int i = 0 ;i<list.size();i++) {
			System.out.print(list.get(i).toString());
		}
	}
	public void addItem(String item) {
		list.add(item);
		
		
	}
	public void moidfyItem(String newItem) {
		int position = findItem(newItem);
		if(position>=0) {
			modifyItem(position,newItem);
		}
		
	}
	public ArrayList<String> getList(){
		return list;
	}
	public void modifyItem(int position,String newItem) {
		list.set(position, newItem);
	}
	public void removeItem(String item) {
		int position = findItem(item);
		if(position>=0) {
			removeItem(position);
		}
		
	}
	public void removeItem(int position) {
		list.remove(position);
		
	}
	public int findItem(String item) {
		return list.indexOf(item);
		
		
	}
	public boolean onFile(String searchItem) {
		int position = findItem(searchItem);
		if(position>=0) {
			return true;
		}
		else 
			return false;
	}

}
