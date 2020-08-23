package _CombinatorPattern;

import java.time.LocalDate;

import _CombinatorPattern.CustomerValidator.ValidationResult;

public class Main {
	public static void main(String[] args) {
		Customer customer = new Customer(
			"Alice","email@","+07754556" , LocalDate.of(2000, 1, 1)
		);
		CustomerValidate validate = new CustomerValidate();
		System.out.println(validate.isValid(customer));
		// if valid we can store customer in db;
	  System.out.println(CustomerValidator.isAdultValidate().and(CustomerValidator.isEmailValid()).and(CustomerValidator.isPhoneNumberValidate()));
///	ValidationResult result  = isEmailValid().and(isPhoneNumberValidate()).apply(customer);
	}

}
