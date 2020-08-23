package _CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;

public class CustomerValidate {

	
	private boolean isEmailValid(String email) {
		return email.contains("@");
		
	}
	private boolean isPhoneNumberValid(String phoneNumber) {
		return phoneNumber.startsWith("+0");
	}
	private boolean isAdult(LocalDate data) {
		return Period.between(data, LocalDate.now()).getYears() >16;
	}
    public boolean isValid(Customer customer) {
    	return isEmailValid(customer.getEmail())&& isPhoneNumberValid(customer.getPhoneNumber()) && isAdult(customer.getDob());
    }
}
