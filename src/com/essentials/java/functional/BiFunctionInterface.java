package src.com.essentials.java.functional;

import java.util.function.BiFunction;

/*
 * BiFunction Interface, represents a function that accepts two arguments and produce a result
 * */
public class BiFunctionInterface extends FunctionBase{

    public void function() {
        System.out.println("BiFunction Interface, represents a function that accepts two arguments and produce a result");
        System.out.println("Normal function " + incrementByOneAndMultiplyByTen(2, 10));
        System.out.println("BiFunction Interface " + incrementByOneAndMultiplyByTenFunction.apply(2, 10));
    }

    static BiFunction<Integer, Integer, Integer> incrementByOneAndMultiplyByTenFunction =
            (numerToIncrementBy, numberToMultiplyBy) -> (numerToIncrementBy + 1) * numberToMultiplyBy;

    static int incrementByOneAndMultiplyByTen(int number, int numToMultiply) {
        return (number + 1) * numToMultiply;
    }

}
