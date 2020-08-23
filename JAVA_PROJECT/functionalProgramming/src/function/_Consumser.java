package function;

import java.util.function.BiConsumer;
import java.util.function.Consumer;

public class _Consumser {
	public static void main(String[] args) {
		greet(new Customer("Maria","0743284"));
		greetConsumer.accept(new Customer("Nhugn","4263423"));
		greetBi.accept(new Customer("Maria","432"), false);
		greetConsumer(new Customer("432","4324"),true);
	}
	static Consumer<Customer> greetConsumer = customer->System.out.println("Hello" + customer.customerName + customer.customerPhone ) ;
	static BiConsumer<Customer,Boolean> greetBi = (customer,showPhone)-> System.out.println("Hello" + (showPhone? customer.customerPhone: "*****"));
	static void greet(Customer customer) {
		System.out.println("Hello"  + " "  + customer.customerName);
	}
	static void greetConsumer(Customer a , Boolean showNum) {
		System.out.println("Hello" + (showNum?a.customerPhone:"*****"));
	}
	static class Customer{
		private final String customerName;
		private final String customerPhone;
		public Customer(String customerName, String customerPhone) {
			super();
			this.customerName = customerName;
			this.customerPhone = customerPhone;
		}
		
	}
	

}
