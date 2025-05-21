package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(56);
        System.out.println("Numbers size: " + numbers.getCurrentSize());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.of(2025, 4, 14));
        dates.add(LocalDate.of(2025, 5, 10));
        System.out.println("Dates size: " + dates.getCurrentSize());

        FixedList<String> names = new FixedList<>(2);
        names.add("Julie");
        names.add("Ezra");
        if (!names.add("David")) {
            System.out.println("Try removing someone before adding more.");
        }

        System.out.println("Names in list: " + names.getItems());
    }
}
