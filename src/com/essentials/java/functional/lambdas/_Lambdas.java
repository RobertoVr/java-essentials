package src.com.essentials.java.functional.lambdas;

import src.com.essentials.java.functional.FunctionBase;

import java.util.function.Consumer;
import java.util.function.Function;

public class _Lambdas extends FunctionBase {
    @Override
    public void function() {


        Function<String, String> upperCaseName = name -> name.toUpperCase();

        Function<String, String> upperCaseName2 = String::toUpperCase;



        upperCaseName2.apply("hola");



    }
}
