package com.pluralsight.collection;

import java.util.ArrayList;
import java.util.List;

public class FixedList<T> {
    private List<T> items;
    private int maxSize;

    public FixedList(int maxSize) {
        this.maxSize = maxSize;
        this.items = new ArrayList<>();
    }

    public boolean add(T item) {
        if (items.size() < maxSize) {
            items.add(item);
            return true;
        } else {
            System.out.println(" List is full. Cannot add: " + item);
            return false;
        }
    }

    public List<T> getItems() {
        return items;
    }

    public int getMaxSize() {
        return maxSize;
    }

    public int getCurrentSize() {
        return items.size();
    }
}
