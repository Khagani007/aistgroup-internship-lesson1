package org.example.exercise8.creational.builder;

public interface Builder {
    void buildPart1(String part1);
    void buildPart2(String part2);
    Product getResult();
}
