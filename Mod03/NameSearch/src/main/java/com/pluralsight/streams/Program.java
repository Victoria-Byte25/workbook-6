package com.pluralsight.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        people.add(new Person ("Victoria", "Brown", 26));
        people.add(new Person("Julie", "Lee", 40));
        people.add(new Person("Jane", "Richie", 30));
        people.add(new Person("Ada", "Ricks", 80));
        people.add(new Person("Dave", "Dykes", 56));
        people.add(new Person("Mo", "Jami", 23));
        people.add(new Person("Melchi", "Komi", 25));
        people.add(new Person("Sean", "Smith", 27));
        people.add(new Person("Ricks", "Owen", 45));
        people.add(new Person("Saint", "Lyn", 36));

        System.out.println("Search for first or last name: ");
        String input = scanner.nextLine().toLowerCase();

        List<Person> matches = new ArrayList<>();
        for ( Person p : people) {
            if (p.getFirstName().toLowerCase().contains(input)
              || p.getLastName().toLowerCase().contains(input)) {
                matches.add(p);
            }
        }
        System.out.println("\nMatching People:");
        for (Person p : matches) {
            System.out.println(p);
        }

        int sumofAges = 0;
        int maxAges = people.get(0).getAge();
        int minAges = people.get(0).getAge();

        for (Person p : people) {
            sumofAges += p.getAge();
            if (p.getAge() > maxAges) maxAges = p.getAge();
            if (p.getAge() < minAges) minAges = p.getAge();
        }

        double averageAge = (double) sumofAges / people.size();

        System.out.println("\n--- Stats ---");
        System.out.printf("Average age: %.1f%n", averageAge);
        System.out.println("Oldest person: " + maxAges);
        System.out.println("Youngest person: " + minAges);



    }
}
