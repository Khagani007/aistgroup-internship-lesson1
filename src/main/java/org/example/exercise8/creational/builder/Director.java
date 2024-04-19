package org.example.exercise8.creational.builder;

public class Director {
    private Builder builder;

    public Director(Builder builder) {
        this.builder = builder;
    }

    public void construct() {
        builder.buildPart1("Part 1");
        builder.buildPart2("Part 2");
    }
}
