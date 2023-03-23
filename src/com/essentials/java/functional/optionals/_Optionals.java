package src.com.essentials.java.functional.optionals;

import src.com.essentials.java.functional.FunctionBase;

import java.util.Optional;

public class _Optionals extends FunctionBase {
    @Override
    public void function() {
        Object value = Optional.ofNullable(null)
                .orElseGet(() -> "defalt value");

        System.out.println(value);

//        Object value2 = Optional.ofNullable(null).orElseThrow(() -> {
//            throw new IllegalStateException("exc");
//        });
//
//        System.out.println(value2);

        Optional.ofNullable("hola@gmail.com").ifPresent(System.out::println);
        Optional.ofNullable(null).ifPresentOrElse(System.out::println, ()->{
            System.out.println("Cannot send email");
        });


    }
}
