package function;

import java.util.function.Predicate;

public class _Predicate {
public static void main(String[] args) {
	System.out.println(isPhoneNumberValid("073423424234"));
	System.out.println(isPhoneValid.and(isContains2).test("0747274723r"));
	System.out.println(isContains2.test("07we3"));
}
static boolean isPhoneNumberValid(String phoneNumber) {
	return phoneNumber.startsWith("07")&& phoneNumber.length()==11;
}
static Predicate<String> isPhoneValid= number-> number.startsWith("07")&& number.length()==11;
static Predicate<String> isContains2=number ->number.contains("3");
}
