package com.pluralsight.collection;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(25);
        numbers.add(3);
        numbers.add(13);
        numbers.add(56);

        System.out.println("Numbers size: " + numbers.getCurrentSize());

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.of(2025, 4, 14));

        System.out.println("Dates size: " + dates.getCurrentSize());

        FixedList<String> names = new FixedList<>(2);
        names.add("Julie");
        names.add("Ezra");
        names.add("David");
    }
}
