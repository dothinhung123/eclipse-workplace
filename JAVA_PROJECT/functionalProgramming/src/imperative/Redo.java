package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Redo {
public static void main(String[] args) {
	List<Person> people = List.of(new Person("nhung",Gender.MALE), new Person("trung",Gender.MALE));
	List<Person> females = new ArrayList<>();
	for(Person person :people) {
		if(person.gender.equals(Gender.MALE)) {
			females.add(person);
			System.out.println(person);
			
		}
	}
	System.out.println(femaleByPredict.test(new Person("nhung",Gender.FEMALE)));
	
	// declarative
	people.stream().filter(p->p.gender.equals(Gender.FEMALE)).collect(Collectors.toList()).forEach(System.out::println );
	List<Person> e = people.stream().filter(p->p.gender.equals(Gender.MALE)).collect(Collectors.toList());
	
	
}
static Predicate<Person> femaleByPredict = female -> female.gender.equals(Gender.FEMALE);
static class Person{
	private final String name;
	private final Gender gender;
	public Person(String name, Gender gender) {
		this.name = name;
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Person [name=" + name + ", gender=" + gender + "]";
	}
	
}
 static enum Gender {
	MALE,FEMALE
}

}
