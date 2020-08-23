package optionals;

import java.util.Optional;

public class Person {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Nhung person = new Nhung("nhj",null);
System.out.println(person.getEmail().map(String::toUpperCase).orElse("hello world ")
	
		);
if(person.getEmail().isPresent()) {
	String email = person.getEmail().get();
	System.out.println(email);
	
}
else {
	System.out.println("hum");
}
	}
	static class Nhung{
		private final String name;
		private final String email;
		public Nhung(String name, String email) {
			super();
			this.name = name;
			this.email = email;
		}
		public String getName() {
			return name;
		}
		public Optional<String> getEmail() {
			return Optional.ofNullable(email);
		}
		@Override
		public String toString() {
			return "Nhung [name=" + name + ", email=" + email + "]";
		}
		
		
	}

}
