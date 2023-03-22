package src.com.essentials.java.functional;

import java.util.function.Function;

/*
 *
 * Functional interface, represents a function that accepts one argument and produce a result
 *
 * */
public class FunctionInterface extends FunctionBase {

    public void function() {
        System.out.println("Function Interface, represents a function that accepts one argument and produce a result ");
        int counter = increment(2);
        System.out.println("increase by normal functino " + counter);

        System.out.println("increase by functional interface " + incrementByOne.apply(4));

        int multiply = multipleBy10.apply(incrementByOne.apply(4));
        System.out.println("multiply by 10 functional interface " + multiply);

        System.out.println("combined functional interface " + addByOneAndMultiplyByTen.apply(5));

    }


    static Function<Integer, Integer> incrementByOne = number -> number + 1;
    static Function<Integer, Integer> multipleBy10 = number -> number * 10;
    static Function<Integer, Integer> addByOneAndMultiplyByTen = incrementByOne.andThen(multipleBy10);

    static int increment(int number) {
        return number + 1;
    }

}
