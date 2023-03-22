package src.com.essentials;

import src.com.essentials.java.functional.*;

public class Main {

    public static void main(String... args) {

        functionalProgramming();

    }

    private static void functionalProgramming() {
        new FunctionInterface().function();
        System.out.println("--------------------------");
        new BiFunctionInterface().function();
        System.out.println("--------------------------");
        new ConsumerInterface().function();
        System.out.println("--------------------------");
        new BiConsumerInterface().function();
        System.out.println("--------------------------");
        new PredicateInterface().function();
        System.out.println("--------------------------");
        new SupplierInterface().function();
    }

}
