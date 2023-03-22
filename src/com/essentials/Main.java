package src.com.essentials;

import java.util.function.Predicate;

public class Main {

    public static void main(String... args){

        String running_first_app = "running first app";
        extracted(running_first_app);
        Predicate<String> HOLA_MUNDO = (val) -> {
            return val.equals("hello");
        };

        System.out.println(HOLA_MUNDO.test("false"));

    }

    private static void extracted(String running_first_app) {
        System.out.println(running_first_app);
        System.out.println(running_first_app);
    }

}
