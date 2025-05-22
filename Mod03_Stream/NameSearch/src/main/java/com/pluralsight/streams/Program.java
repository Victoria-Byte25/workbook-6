package com.pluralsight.streams;

import java.util.*;
import java.util.stream.Collectors;

public class Program {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Person> people = List.of(
                new Person("Melchi", "Komi", 24),
                new Person("Sean", "Smith", 21),
                new Person("Ricks", "Owen", 31),
                new Person("Saint", "Lyn", 28),
                new Person("Julie", "West", 27),
                new Person("Naade", "Brown", 25),
                new Person("Elisha", "Grant", 18),
                new Person("Zion", "West", 20),
                new Person("Maya", "Scott", 30),
                new Person("Ezra", "Smith", 35)
        );

        System.out.print("Search for first or last name: ");
        String input = scanner.nextLine().toLowerCase();

        List<Person> matches = people.stream()
                .filter(p -> p.getFirstName().toLowerCase().contains(input)
                        || p.getLastName().toLowerCase().contains(input))
                .collect(Collectors.toList());

        System.out.println("\nMatching People:");
        matches.forEach(System.out::println);
        OptionalDouble averageAge = people.stream()
                .mapToInt(Person::getAge)
                .average();

        OptionalInt oldest = people.stream()
                .mapToInt(Person::getAge)
                .max();

        OptionalInt youngest = people.stream()
                .mapToInt(Person::getAge)
                .min();

        System.out.println("\n--- Stats ---");
        System.out.printf("Average age: %.1f%n", averageAge.orElse(0));
        System.out.println("Oldest age: " + oldest.orElse(0));
        System.out.println("Youngest age: " + youngest.orElse(0));
    }
}
