package org.example.exercise8.creational.builder;

public class BuilderPatternExample {
    public static void main(String[] args) {
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);

        director.construct();
        Product product = builder.getResult();

        System.out.println(product);
    }
}
