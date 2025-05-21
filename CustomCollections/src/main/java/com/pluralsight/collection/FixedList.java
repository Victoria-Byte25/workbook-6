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
        if (items.size() >= maxSize) {
            System.out.println(" Can't add \"" + item + "\". List is full (" + maxSize + " items max).");
            return false;
        }

        items.add(item);
        return true;
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
