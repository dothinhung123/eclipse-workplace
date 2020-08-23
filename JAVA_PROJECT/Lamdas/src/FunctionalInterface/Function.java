package FunctionalInterface;

import java.util.HashMap;
import java.util.Map;

public class Function {
	public static void main(String[] args) {
		Map<String,Integer> nameMap = new HashMap<>();
		Integer value = nameMap.computeIfAbsent("John", s->s.length());
		Integer value2 = nameMap.computeIfAbsent("hoh", String::length);
		System.out.println(value);
		System.out.println(value2);
		Map<String, Integer> salaries = new HashMap<>();
		salaries.put("John", 40000);
		salaries.put("Freddy", 30000);
		salaries.put("Samuel", 50000);
		 
		salaries.replaceAll((name, oldValue) -> 
		  name.equals("Freddy") ? oldValue : oldValue + 10000);
      System.out.println(salaries.toString());
		
	}

}
