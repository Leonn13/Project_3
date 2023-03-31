package com.example.iterable;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Bag<T> implements Container<T> {

    protected List<T> boxes;

    ArrayList arr = new ArrayList<T>();

    public Bag() {
        this.boxes = new ArrayList<>();
    }

    public void addContainer(T container) {
        this.boxes.add(container);
    }

    @Override
    public boolean isEmpty() {
        return arr.isEmpty();
    }

    @Override
    public int size() {
        return arr.size();
    }

    @Override
    public void add(T item) {
        arr.add(item);
    }

    @Override
    public Iterator<T> iterator() {
        return arr.iterator();
    }
}