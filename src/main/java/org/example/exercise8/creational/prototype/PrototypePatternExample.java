package org.example.exercise8.creational.prototype;

public class PrototypePatternExample {
    public static void main(String[] args) {
        ConcretePrototype original = new ConcretePrototype("Original Property");


        ConcretePrototype clone = (ConcretePrototype) original.clone();

        System.out.println("Original: " + original);
        System.out.println("Clone: " + clone);


        clone.property = "Modified Property";
        System.out.println("Original after modification: " + original);
        System.out.println("Clone after modification: " + clone);
    }
}
