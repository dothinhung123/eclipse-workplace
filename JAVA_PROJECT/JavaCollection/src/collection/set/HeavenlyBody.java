package collection.set;

import java.util.HashSet;
import java.util.Set;

public class HeavenlyBody {
	private final String name;
	private final String orbintalPerson;
	private Set<HeavenlyBody> satelites;
    public HeavenlyBody(String name , String orbintalPerson) {
    	this.name = name;
    	this.orbintalPerson= orbintalPerson;
    	this.satelites = new HashSet<>();
    }
    public String getName() {
    	return this.name;
    }
    public String getOrbintalPerson() {
    	return this.orbintalPerson;
    }
    public boolean addMoon(HeavenlyBody moon) {
    	return this.satelites.add(moon);
    }
    public Set<HeavenlyBody> getSatelites(){
    	return new HashSet<>(this.satelites);
    }
    
}
