package ArrayList;

import java.util.ArrayList;

public class GroceyList {
	private int[] myNumbers =  new int[50];
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addGroceryItem(String item) {
		groceryList.add(item);
	
	}
	public void printGroceryList() {
		System.out.print("You have" + groceryList.size() + "items in your grocery list");
		for(int i = 0 ;i<groceryList.size(); i++) {
			System.out.print((i+1) + "." + groceryList.get(i)); 
		}
	}
	public void modifyGroceryItem(int position,String newItem) {
		groceryList.set(position, newItem);
		System.out.print("Grocery Item" + (position + 1) + "has been modified");
	}
	public void removeGroceryItem(int position) {
	//	String theItem = groceryList.get(position);
		groceryList.remove(position);
		
	
	}
	public String findItem(String searchItem) {
		//boolean exits = groceryList.contains(searchItem);
		int position = groceryList.indexOf(searchItem);
		if(position >=0) {
			return groceryList.get(position);
		}
		return null;
		
	}

}
