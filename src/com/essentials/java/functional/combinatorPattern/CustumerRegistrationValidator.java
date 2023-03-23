package src.com.essentials.java.functional.combinatorPattern;

import java.time.LocalDate;
import java.time.Period;
import java.util.function.Function;

import static src.com.essentials.java.functional.combinatorPattern.CustumerRegistrationValidator.*;

public interface CustumerRegistrationValidator extends Function<Customer, ValidationResult> {

    static CustumerRegistrationValidator isEmailValid() {
        return customer -> customer.getEmail().contains("@") ?
                ValidationResult.SUCCESS :
                ValidationResult.EMAIL_NOT_VALID;
    }

    static CustumerRegistrationValidator isPhoneNumberValid() {
        return customer -> customer.getPhoneNumber().startsWith("54") ?
                ValidationResult.SUCCESS :
                ValidationResult.PHONE_NUMBER_NOT_VALID;
    }

    static CustumerRegistrationValidator isAdult() {
        return customer -> Period.between(customer.getDob(), LocalDate.now()).getYears() > 16 ?
                ValidationResult.SUCCESS :
                ValidationResult.IS_NOT_ADULT;
    }

    default CustumerRegistrationValidator and(CustumerRegistrationValidator other) {
        return customer -> {
            ValidationResult result = this.apply(customer);
            return result.equals(ValidationResult.SUCCESS) ? other.apply(customer) : result;
        };
    }

    enum ValidationResult {
        SUCCESS,
        PHONE_NUMBER_NOT_VALID,
        EMAIL_NOT_VALID,
        IS_NOT_ADULT

    }

}
