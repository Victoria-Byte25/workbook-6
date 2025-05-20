package com.pluralsight;

import java.util.ArrayList;

public class LoopyMain {
    public static void main(String[] args) {
        ArrayList<Object> things = new ArrayList<>();
        things.add("A");
        things.add(1.0);
        things.add(42);
        things.add(true);
        things.add('Z');

        for (Object object : things) {
            if (object instanceof String) {
                System.out.println(object + " is a String");
            } else if (object instanceof Double) {
                System.out.println(object + " is a Double");
            } else if (object instanceof Integer) {
                System.out.println(object + " is an Integer");
            } else if (object instanceof Boolean) {
                System.out.println(object + " is a Boolean");
            } else if (object instanceof Character) {
                System.out.println(object + " is a Character");
            } else {
                System.out.println(object + " is an Unknown type");
            }
        }
    }
}

