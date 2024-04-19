package org.example.exercise6;

import java.util.Scanner;

public class CalculatorApp {
    public static void main(String[] args) {
        Calculator calculator = new Calculator();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Enter an expression (use any number of operands and operators, and press Enter when done):");

            String input = scanner.nextLine().replaceAll("\\s+", "");

            try {
                double result = calculator.evaluate(input);
                System.out.println("Result: " + result);
            } catch (ArithmeticException e) {
                System.out.println("Error: " + e.getMessage());
            }
        }
    }

}
