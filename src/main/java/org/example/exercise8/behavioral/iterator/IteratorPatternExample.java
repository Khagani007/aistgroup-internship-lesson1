package org.example.exercise8.behavioral.iterator;

public class IteratorPatternExample {
    public static void main(String[] args) {
        ConcreteAggregate aggregate = new ConcreteAggregate();
        aggregate.addItem("Item 1");
        aggregate.addItem("Item 2");
        aggregate.addItem("Item 3");

        Iterator<String> iterator = (Iterator<String>) aggregate.createIterator();

        while (iterator.hasNext()) {
            String item = iterator.next();
            System.out.println("Item: " + item);
        }
    }
}
