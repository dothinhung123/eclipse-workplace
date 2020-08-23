package streams;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.Predicate;
import java.util.function.ToIntFunction;
import java.util.stream.Collectors;

public class Stream {
	public static void main(String[] args) {
		List<Person> people = List.of(new Person("nhung",Gender.FEMALE));
		ToIntFunction<String> length= String::length;
		Function<Person,String> personStringFunction= person->person.name;
		IntConsumer println = System.out::println;
		people.stream()
		.map(person->person.name)
		.collect(Collectors.toSet()).forEach(gender->System.out.println(gender));
		//
		people.stream().map(person->person.name).mapToInt(String::length).forEach(System.out::println);
		people.stream().map(person->person.gender).collect(Collectors.toSet()).forEach(System.out::println);
	
		people.stream().allMatch(person-> Gender.FEMALE.equals(person.gender));
	//
		people.stream().noneMatch(person->Gender.MALE.equals(person.gender));
		Predicate<Person> personPredicate =person -> Gender.FEMALE.equals(person.gender);
	   people.stream().allMatch(personPredicate);
	 System.out.println(  people.stream().anyMatch(person->Gender.MALE.equals(person.gender)));
	
	
	}
	static class Person{
		private final String name;
		private final Gender gender;
		public Person(String name, Gender gender) {
			super();
			this.name = name;
			this.gender = gender;
		}
		
		
	}
	static enum Gender{
		MALE,FEMALE
	}

}
