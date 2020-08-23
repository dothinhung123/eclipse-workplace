package collection.map;

import java.util.HashMap;
import java.util.Map;

public class Location {
	private final int locationID;
	private final String descritpion;
	private final Map<String, Integer> exists;
	
	public Location(int locationID, String description) {
		this.locationID = locationID;
		this.descritpion = description;
		this.exists = new HashMap<String,Integer>();
	}
	public void addExit(String direction, int location) {
		exists.put(direction, location);
	}
	
	public int getLocationID() {
		return locationID;
	}

	public Map<String, Integer> getExists() {
		return new HashMap<String , Integer>(exists);
		// return exists;
	}

	public String getDescritpion() {
		return descritpion;
	}
}
