package src.com.essentials;

import src.com.essentials.java.functional.*;
import src.com.essentials.java.streams._Stream;

public class Main {

    public static void main(String... args) {

        functionalProgramming();
        streamFunctionalProgramming();

    }

    private static void functionalProgramming() {
        new FunctionInterface().function();
        System.out.println("--------------------------");
        new BiFunctionInterface().function();
        System.out.println("--------------------------");
        new ConsumerInterface().function();

        new ConsumerInterface().inicio.function();

        System.out.println("--------------------------");
        new BiConsumerInterface().function();
        System.out.println("--------------------------");
        new PredicateInterface().function();
        System.out.println("--------------------------");
        new SupplierInterface().function();
    }

    public static void streamFunctionalProgramming() {
        System.out.println("--------------------------");
        new _Stream().function();
    }

}
