package optionals;

import java.util.Optional;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Optional<Object> empty = Optional.empty();
Optional<String> value = Optional.of("hello");
Optional<String> value2 = Optional.ofNullable(null);
System.out.println(empty.isEmpty());
System.out.println(value.isEmpty());
String orElse = value2.orElse("world");
System.out.println(orElse);
String v = value2.map(String::toUpperCase).orElse("word");
System.out.println(v);
String v2 = value2.map(String::toUpperCase).orElseGet(()->{
	return "worodl";
});
String v3 = value2.map(String::toUpperCase).orElseThrow(IllegalStateException::new);
value.ifPresentOrElse(System.out::println, ()-> System.out.println("Hello"));
	}

}
