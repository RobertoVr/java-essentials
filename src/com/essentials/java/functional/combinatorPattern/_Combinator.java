package src.com.essentials.java.functional.combinatorPattern;

import src.com.essentials.java.functional.FunctionBase;

import java.time.LocalDate;

import static src.com.essentials.java.functional.combinatorPattern.CustomerRegistrationValidator.*;

public class _Combinator extends FunctionBase {

    @Override
    public void function() {
        Customer customer = new Customer(
                "rvr",
                "rvrou@tlook.com",
                "54123123",
                LocalDate.of(2003, 1, 1)
        );

//        System.out.println(new CustumerValidatorService().isValid(customer));


        ValidationResult result = isEmailValid()
                .and(isPhoneNumberValid())
                .and(isAdult())
                .apply(customer);

        if(result != ValidationResult.SUCCESS){
            throw new IllegalStateException(result.name());
        }

    }
}
