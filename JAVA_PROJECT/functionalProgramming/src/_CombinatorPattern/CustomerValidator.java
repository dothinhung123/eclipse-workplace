package _CombinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;
import static _CombinatorPattern.CustomerValidator.*;

public interface  CustomerValidator extends Function<Customer,ValidationResult> {
	static CustomerValidator isEmailValid() {
		return customer->customer.getEmail().contains("@")?
			ValidationResult.SUCESS : ValidationResult.EMAIL_NOT_VALID;
	}
	static CustomerValidator isPhoneNumberValidate() {
		return customer->customer.getPhoneNumber().contains("+0")? ValidationResult.SUCESS: ValidationResult.PHONE_NUMBER_NOT_VALID;
				
	}
	static CustomerValidator isAdultValidate() {
		return customer->Period.between(customer.getDob(), LocalDate.now()).getYears() >16 ?ValidationResult.SUCESS: ValidationResult.IS_NOT_AN_ADULT;
				
	}
	default CustomerValidator and (CustomerValidator other) {
		return customer->{
			ValidationResult result = this.apply(customer);
			return result.equals(ValidationResult.SUCESS)?other.apply(customer):result;
		};
	}
	
	static enum ValidationResult{
		SUCESS,
		PHONE_NUMBER_NOT_VALID,
		EMAIL_NOT_VALID,
		IS_NOT_AN_ADULT
		
	}

}
