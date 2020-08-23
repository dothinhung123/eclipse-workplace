package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    List<Person> people = List.of(
    	new Person("Jonh",Gender.FEMALE),
    	new Person("Alice", Gender.FEMALE),
        new Person ("Alice", Gender.MALE)
    		);
    // imperative approach
    List<Person> females = new ArrayList<>();
    for(Person person : people) {
    	if(person.gender.equals(Gender.FEMALE)) {
    		females.add(person);
    		
   
    	}
    }
    for(Person f : females) {
    	System.out.println(f);
    }
    // declarative approach
   List<Person> femalesDeclarative = people.stream().filter( p-> p.gender.equals(Gender.FEMALE) )
    .collect(Collectors.toList());
   femalesDeclarative.forEach(System.out::println);
//   people.stream().filter( p-> p.gender.equals(Gender.FEMALE) )
//   .collect(Collectors.toList()).forEach(System.out::println);
	}
	static class Person{
		private final String name;
		private final Gender gender ;
		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}
		@Override
		public String toString() {
			return "Person [name=" + name + ", gender=" + gender + "]";
		}
		
		
	}
	enum Gender {
		MALE,FEMALE
	}

}

