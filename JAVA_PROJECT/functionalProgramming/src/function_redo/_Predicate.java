package function_redo;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class _Predicate {
	public static void main(String[] args) {
		System.out.println(phoneN.and(con).test("094234234"));
		System.out.println(nu.test("0734","0734"));
		
	}
	static boolean validateString(String phone) {
		return phone.startsWith("09")&& phone.contains("3");
	}
	static Predicate<String> phoneN= number-> number.startsWith("09")&& number.contains("3") ;
	static Predicate<String> con = number-> number.length()==9;
	static BiPredicate<String,String> nu =(num1,num2)->num1.equals(num2);

}
