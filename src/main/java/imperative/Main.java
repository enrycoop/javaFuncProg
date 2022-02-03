package imperative;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static imperative.Main.Gender.FEMALE;
import static imperative.Main.Gender.MALE;

public class Main {
    public static void main(String[] args) {
        List<Person> people = List.of(
                new Person("ben", MALE),
                new Person("jhon", MALE),
                new Person("Giovanna", FEMALE)
        );

        // ********* Imperative approach ****************
        List<Person> females = new ArrayList<>();

        for (Person person : people){
            if (FEMALE.equals(person.gender)) {
                females.add(person);
            }
        }
        for (Person female : females){
            System.out.println(female);
        }
        // ***********************************************

        // ##################################################

        // *********** Declarative approach **************

        people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .forEach(System.out::println);

        // if you need Females list
        List<Person> females_ = people.stream()
                .filter(person -> FEMALE.equals(person.gender))
                .collect(Collectors.toList());

        females_.forEach(System.out::println);
        // ************************************************
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
