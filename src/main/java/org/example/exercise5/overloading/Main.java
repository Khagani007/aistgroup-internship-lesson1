package org.example.exercise5.overloading;

public class Main {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();

        int sumInt = calculator.add(5, 7);
        double sumDouble = calculator.add(3.5, 4.2);

        System.out.println("Sum of integers: " + sumInt); // Output: Sum of integers: 12
        System.out.println("Sum of doubles: " + sumDouble); // Output: Sum of doubles: 7.7
    }
}
