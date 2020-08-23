package collection.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
	private static Map<Integer,Location> location = new HashMap<Integer,Location>();
	private static Scanner scanner = new Scanner(System.in);
	public static void main(String[] args) {
//	Map<String,String> a = new HashMap<>();
//	a.put("java", "an bject oriented lanagues");
//	a.put("Enlgish","Its easy to use");
//	a.replace("java","Hum it's a backend lanagues");
//	a.remove("java");
//	for(String key: a.keySet() ) {
//		System.out.println(key +" : " +a.get(key));
//	}
//	
//  
		location.put(0, new Location(0,"You are siting in formt ono focm"));
		location.put(1,new Location(1,"1"));
		location.put(2,new Location(2,"2"));
		location.get(1).addExit("W", 2);
		location.get(1).addExit("E", 3);
		location.get(1).addExit("S", 4);
		location.get(1).addExit("N",5);
		location.get(2).addExit("M", 5);
		Map<String,String> vocabulary = new HashMap<String,String>();
		vocabulary.put("QUIT","Q");
		vocabulary.put("NORTH","N");
		vocabulary.put("WEST","W");
		vocabulary.put("EAST","E");
		
//		int loc = 1;
//		while(true) {
//			System.out.println(location.get(loc).getDescritpion());
//			if(loc==0) {
//				break;
//			}
//			loc = scanner.nextInt();
//			if(!location.containsKey(loc)) {
//				System.out.println("You can not go in that direactoion");
//			}
		int loc= 1;
		while(true) {
			System.out.println(location.get(loc).getDescritpion());
			if(loc==0) {
				break;
			}
			Map<String,Integer> exists = location.get(loc).getExists();
			System.out.println("Available eixts are");
			for(String exit : exists.keySet()) {
				System.out.println(exit +",");
				
			}
			System.out.println();
			String direction= scanner.nextLine().toUpperCase();
			if(direction.length()>1) {
					String[] words = direction.split(" ");
					for(String word:words) {
						if(vocabulary.containsKey(word)) {
							direction = vocabulary.get(word);
							break;
						}
					}
			}
			if(exists.containsKey(direction)) {
				loc = exists.get(direction);
			}
			else {
				System.out.println("You cannot go int that direcation");
			}
		}
		
	}

}
