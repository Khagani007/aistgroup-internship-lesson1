package org.example.exercise8.structural.bridge;

public class RefinedAbstraction extends Abstraction {
    public RefinedAbstraction(Implementor implementor) {
        super(implementor);
    }

    @Override
    public void operation() {
        System.out.println("Refined Abstraction operation");
        implementor.operationImpl();
    }
}
