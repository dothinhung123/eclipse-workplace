package streamAPI;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collectors;

public class Main {
	public static void main(String[] args) {
		List<Person> people = getPeople();
		List<Person> females = new ArrayList<>();
		for(Person p : people) {
			if(p.getGender().equals(Gender.FEMALE)) {
				females.add(p);
			}
		}
//		females.forEach(p->System.out.println(p));
//		females.forEach(System.out::println);
//		// filter
//		people.stream().filter(p->p.getGender().equals(Gender.FEMALE)).collect(Collectors.toSet()).forEach(System.out::println);
//		//sort
	//	people.stream().sorted(Comparator.comparing(p->p.getAge())).collect(Collectors.toSet()).forEach(System.out::println);
		people.stream().sorted(Comparator.comparing(p->p.getAge())).collect(Collectors.toList()).forEach(System.out::println);
		people.stream().sorted(Comparator.comparing(Person::getAge).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		people.stream().sorted(Comparator.comparing(Person::getAge).thenComparing(Person::getGender).reversed()).collect(Collectors.toList()).forEach(System.out::println);
		// allmatch
		boolean allmathc = people.stream().allMatch(p->p.getGender().equals(Gender.MALE));
		System.out.println(allmathc);
		//anymatch
		boolean anymatch = people.stream().anyMatch(p->p.getGender().equals(Gender.FEMALE));
		System.out.println(anymatch);
		//none match
		boolean nonematch = people.stream().noneMatch(p->p.getAge()<1);
		System.out.println(nonematch);
		//max
		Optional<Person> max = people.stream().max(Comparator.comparing(Person::getAge));
		//min 
		people.stream().min(Comparator.comparing(Person::getAge)).ifPresent(System.out::println);
		//group
	Map<Gender,List<Person>> grounByGender = people.stream().collect(Collectors.groupingBy(Person::getGender));
	grounByGender.forEach((gender,p)->{System.out.println(gender); p.forEach(System.out::println);});	
		people.stream().filter(p->p.getAge()>1).min(Comparator.comparing(Person::getAge)).map(p->p.getName()).ifPresent(name->System.out.println(name));
	}
	private static List<Person > getPeople() {
		List<Person> people = List.of(
		new Person("nhung",24,Gender.MALE),
		new Person("trun",4,Gender.MALE),
		new Person("huong",43,Gender.FEMALE),
		new Person("tung",3,Gender.FEMALE));
		return people;
	}

}
