package src.com.essentials.java.functional;

import java.util.function.Consumer;

/*
 * Consumer interface, represents an operation that accepts a single input argument and returns no result
 *
 * */
public class ConsumerInterface extends FunctionBase {

    public void function() {
        System.out.println("Consumer interface, represents an operation that accepts a single input argument and returns no result");
        Customer customer = new Customer("Rbr", "001010");
        greetCustomer(customer);
        greetCustomerConsumer.accept(customer);
    }

    static Consumer<Customer> greetCustomerConsumer = customer ->
            System.out.println("Function, Hello ".concat(customer.customerName).concat(", thanks for registering phone number ".concat(customer.customerPhoneNumber)));

    static void greetCustomer(Customer customer) {
        System.out.println("Hello ".concat(customer.customerName).concat(", thanks for registering phone number ".concat(customer.customerPhoneNumber)));
    }

    static class Customer {
        private final String customerName;
        private final String customerPhoneNumber;

        public Customer(String customerName, String customerPhoneNumber) {
            this.customerName = customerName;
            this.customerPhoneNumber = customerPhoneNumber;
        }
    }

}
