package org.example.exercise8.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ConcreteAggregate implements Aggregate {
    private List<String> items;

    public ConcreteAggregate() {
        items = new ArrayList<>();
    }

    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public Iterator<String> createIterator() {
        return (Iterator<String>) new ConcreteIterator(items);
    }
}
