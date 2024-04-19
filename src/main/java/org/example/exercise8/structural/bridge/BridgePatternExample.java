package org.example.exercise8.structural.bridge;

public class BridgePatternExample {
    public static void main(String[] args) {
        Implementor implementorA = new ConcreteImplementorA();
        Implementor implementorB = new ConcreteImplementorB();

        Abstraction abstraction1 = new RefinedAbstraction(implementorA);
        abstraction1.operation();

        Abstraction abstraction2 = new RefinedAbstraction(implementorB);
        abstraction2.operation();
    }
}
