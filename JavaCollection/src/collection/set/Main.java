package collection.set;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Main {
	private static Map<String , HeavenlyBody> solarySystem = new HashMap<>();
	private static Set<HeavenlyBody> planets = new HashSet<>();
	public static void main(String[] args) {
		HeavenlyBody temp = new HeavenlyBody("Mercury","88");
		solarySystem.put(temp.getName(), temp);
		planets.add(temp);
		temp = new HeavenlyBody("Verus","238");
		solarySystem.put(temp.getName(), temp);
		planets.add(temp);
		temp = new HeavenlyBody("Earth","88");
		solarySystem.put(temp.getName(), temp);
		planets.add(temp);
		
		HeavenlyBody tempMoon = new HeavenlyBody("Moon","27");
		solarySystem.put(tempMoon.getName(), tempMoon);
		planets.add(tempMoon);
		System.out.println("Planents");
		for(HeavenlyBody planet : planets) {
			System.out.println(planet.getName());
		}
		HeavenlyBody body = solarySystem.get("Moon");
		System.out.println(body.getName());
		for(HeavenlyBody jupiter: body.getSatelites()) {
			System.out.print(jupiter.getName());
		}
		
	}

}
