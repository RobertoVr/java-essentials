package src.com.essentials.java.functional.callback;

import src.com.essentials.java.functional.FunctionBase;

import java.util.function.Consumer;

public class _Callbacks extends FunctionBase {
    @Override
    public void function() {

        greet("rbr", null, value -> {
            System.out.println("lName not provided for " + value);
        });

        greet("rbr",
                null,
                () -> System.out.println("lName not provided")
        );

    }

    static void greet(String firstName, String lName, Consumer<String> callback) {
        System.out.println(firstName);
        if (lName != null) {
            System.out.println(lName);
        } else {
            callback.accept(firstName);
        }
    }

    static void greet(String firstName, String lName, Runnable callback) {
        System.out.println(firstName);
        if (lName != null) {
            System.out.println(lName);
        } else {
            callback.run();
        }
    }


}
