package function_redo;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		person.accept(new Person("nhung","23123"));
		per.accept(new Person("nhung","43264273"), true);

	}
   static Consumer<Person> person = person->System.out.println(person.customerName + person.customerPhone );
   static BiConsumer<Person,Boolean> per = (customer,showNumber)-> System.out.println(customer.customerName + " " + (showNumber ? customer.customerPhone : "*****"));
   static class Person{
	   private final String customerName;
	   private final String customerPhone;
	public Person(String customerName, String customerPhone) {
		super();
		this.customerName = customerName;
		this.customerPhone = customerPhone;
	}
	   
   }
}
