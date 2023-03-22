package src.com.essentials.java.streams;

import src.com.essentials.java.functional.FunctionBase;

import java.util.List;
import java.util.stream.Collectors;

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

        people.stream()
                .map(person -> person.name)
                .mapToInt(String::length)
                .forEach(System.out::println);


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
