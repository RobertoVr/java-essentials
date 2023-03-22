package src.com.essentials.java.functional;

import java.util.function.BiConsumer;

/*
 *
 * BiConsumer Interface, represents an operation that accepts a single input argument and returns no result
 *
 * */
public class BiConsumerInterface extends FunctionBase {
    @Override
    public void function() {
        System.out.println("BiConsumer represents an operation that accepts a single input argument and returns no result");
        greetCustomerBiConsumer.accept(new Customer("rbv", "33123123"), true);
        greetCustomerBiConsumer.accept(new Customer("vrt", "123"), false);

    }

    BiConsumer<Customer, Boolean> greetCustomerBiConsumer = (customer, showPhoneNumber) ->
            System.out.println("Hello ".concat(customer.customerName).concat(", thanks for registering phone number ".
                    concat(showPhoneNumber ? customer.customerPhoneNumber : "*".repeat(customer.customerPhoneNumber.length()))));

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }

    }
}
