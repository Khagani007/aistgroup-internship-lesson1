package org.example.exercise8.behavioral.iterator;

import java.util.List;

public class ConcreteIterator implements Iterator<String> {
    private List<String> items;
    private int position;

    public ConcreteIterator(List<String> items) {
        this.items = items;
        this.position = 0;
    }

    @Override
    public boolean hasNext() {
        return position < items.size();
    }

    @Override
    public String next() {
        if (hasNext()) {
            return items.get(position++);
        }
        return null;
    }
}
