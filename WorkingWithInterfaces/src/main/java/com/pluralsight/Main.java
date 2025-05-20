package com.pluralsight;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        List<Person> myFamily = new ArrayList<>();

        myFamily.add(new Person("Dave", "Dykes", 56));
        myFamily.add(new Person("Jane", "Westly", 31));
        myFamily.add(new Person("Melchi", "Komi", 5));
        myFamily.add(new Person("Karyna", "Krupodor", 26));
        myFamily.add(new Person("Victoria", "Brown", 25));
        myFamily.add(new Person("Mo", "Sudan", 17));
        myFamily.add(new Person("Lola", "Nade", 12)); // to test age sort

        System.out.println("Before sorting:");
        myFamily.forEach(System.out::println);
        Collections.sort(myFamily);

        System.out.println("\nAfter sorting by lastName > firstName > age:");
        myFamily.forEach(System.out::println);
    }
}

