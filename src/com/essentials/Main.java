package src.com.essentials;

import src.com.essentials.java.functional.BiFunctionInterface;
import src.com.essentials.java.functional.ConsumerInterface;
import src.com.essentials.java.functional.FunctionInterface;

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
    }

}
