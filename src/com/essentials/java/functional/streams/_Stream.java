package src.com.essentials.java.functional.streams;

import src.com.essentials.java.functional.FunctionBase;

import java.util.List;
import java.util.function.Function;
import java.util.function.IntConsumer;
import java.util.function.ToIntFunction;

public class _Stream extends FunctionBase {


    /*
     *
     * Method reference ::
     * Stream API
     *
     * */
    @Override
    public void function() {
        List<Person> people = List.of(
                new Person("wal", Person.Gender.MALE),
                new Person("sea", Person.Gender.FEMALE),
                new Person("sonny", Person.Gender.FEMALE),
                new Person("ron", Person.Gender.NOT_SAY),
                new Person("the rock", Person.Gender.MALE)
        );

        Function<Person, String> personStringFunction = person -> person.name;

        ToIntFunction<String> length = String::length;

        IntConsumer println = System.out::println;

        people.stream()
                .map(personStringFunction)
                .mapToInt(length)
                .forEach(println);

        boolean isGender = people.stream()
                .anyMatch(person -> Person.Gender.FEMALE.equals(person.gender));

        System.out.println(isGender);

    }

    static class Person {
        private final String name;
        private final Gender gender;

        public Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender='" + gender.toString() + '\'' +
                    '}';
        }

        enum Gender {
            MALE, FEMALE, NOT_SAY
        }
    }


}
