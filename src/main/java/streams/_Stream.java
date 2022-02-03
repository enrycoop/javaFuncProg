package streams;

import imperative.Main;

import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import static streams._Stream.Gender.FEMALE;
import static streams._Stream.Gender.MALE;

public class _Stream {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("Ben", MALE),
                new Person("Sara", FEMALE),
                new Person("Jhon", MALE),
                new Person("Giovanna", FEMALE)
        );

        // From people to print a SET of possible gender
        people.stream()
                .map(person -> (person.gender))
                .collect(Collectors.toSet())
                .forEach(System.out::println);

        boolean onlyFemale = people.stream()
                .allMatch(person -> FEMALE.equals(person.gender));
        boolean anyFemale = people.stream()
                .anyMatch(person -> FEMALE.equals(person.gender));
        boolean noneFemale = people.stream()
                .noneMatch(person -> FEMALE.equals(person.gender));
        System.out.println(
                "\nonlyFemale : "+ onlyFemale +
                "\nanyFemale : "+ anyFemale +
                "\nnoneFemale : "+ noneFemale );


    }


    private static class Person {
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
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE
    }
}
