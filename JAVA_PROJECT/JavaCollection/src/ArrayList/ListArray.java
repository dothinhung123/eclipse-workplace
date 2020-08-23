package ArrayList;

import java.util.ArrayList;

public class ListArray {
	private ArrayList<String> groceryList = new ArrayList<String>();
	
	public void addList(String item) {
		groceryList.add(item);
	}
	public void printGroceryList() {
		System.out.print("The array list includes ");
		for(int i = 0 ;i< groceryList.size();i++) {
			System.out.println(groceryList.get(i) + " ");
		}
	}
	public void moidifyGroceryList(int position, String item) {
		groceryList.set(position,item);
	}
	public void removeGroceryList(int position) {
		groceryList.remove(position);
		}
	public String findAnItem(String item) {
		int index  = groceryList.indexOf(item);
		if(index>=0) {
			return groceryList.get(index);
		}
		return null;
	}

}
