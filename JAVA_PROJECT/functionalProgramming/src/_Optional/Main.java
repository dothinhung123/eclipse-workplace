package _Optional;

import java.util.Optional;
import java.util.function.Supplier;

public class Main {
	public static void main(String[] args) {
		// deal with null pointer exception
		Supplier<IllegalStateException> exception= ()-> new IllegalStateException("exception");
	 Optional.ofNullable("").ifPresent(value->{System.out.println(value);});
//	Object value =	Optional.ofNullable("null").orElseGet(()->"default value");
//	Object value2= Optional.ofNullable("Hello").orElseThrow(exception);
//	System.out.println(value2);
//System.out.println(value);
	 Optional.ofNullable("nhung").ifPresent(System.out::println);
	 Optional.ofNullable(null).ifPresentOrElse((v)->System.out.println(v), ()->System.out.println("eXCEPTION"));
	}
	

}
