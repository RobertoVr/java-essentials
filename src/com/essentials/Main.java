package src.com.essentials;

import src.com.essentials.java.design.patterns.factory._Factory;
import src.com.essentials.java.functional.*;
import src.com.essentials.java.functional.callback._Callbacks;
import src.com.essentials.java.functional.combinatorPattern._Combinator;
import src.com.essentials.java.functional.optionals._Optionals;
import src.com.essentials.java.functional.streams._Stream;

public class Main {

    public static void main(String... args) {

        functionalProgramming();
        streamFunctionalProgramming();
        optionalFunctionalProgramming();
        combinatorFunctionalProgramming();
        callBackFunctionalProgramming();
        factoryPattern();
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

    public static void streamFunctionalProgramming() {
        System.out.println("--------------------------");
        new _Stream().function();
    }
    public static void optionalFunctionalProgramming(){
        System.out.println("--------------------------");
        new _Optionals().function();
    }
    public static void combinatorFunctionalProgramming(){
        System.out.println("--------------------------");
        new _Combinator().function();
    }
    public static void callBackFunctionalProgramming(){
        System.out.println("--------------------------");
        new _Callbacks().function();
    }

    private static void factoryPattern(){
        System.out.println("------------FACTORY--------------");
        new _Factory().function();
    }
}
