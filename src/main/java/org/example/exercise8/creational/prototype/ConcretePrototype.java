package org.example.exercise8.creational.prototype;

public class ConcretePrototype implements Prototype {
    String property;

    public ConcretePrototype(String property) {
        this.property = property;
    }

    public ConcretePrototype(ConcretePrototype other) {
        this.property = other.property;
    }

    @Override
    public Prototype clone() {

        return new ConcretePrototype(this);
    }

    @Override
    public String toString() {
        return "ConcretePrototype [property=" + property + "]";
    }
}
