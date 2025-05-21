package com.pluralsight.collection;

import java.time.LocalDate;

public class MainApp {
    public static void main(String[] args) {

        FixedList<Integer> numbers = new FixedList<>(3);
        numbers.add(10);
        numbers.add(3);
        numbers.add(92);
        numbers.add(43);

        System.out.println("Numbers size: " + numbers.getCurrentSize()); // 3

        FixedList<LocalDate> dates = new FixedList<>(2);
        dates.add(LocalDate.now());
        dates.add(LocalDate.now());
        dates.add(LocalDate.of(2024, 1, 1)); // should fail

        System.out.println("Dates size: " + dates.getCurrentSize()); // 2

        FixedList<String> names = new FixedList<>(2);
        names.add("Naade");
        names.add("Victoria");
        names.add("Babalola");
    }
}
