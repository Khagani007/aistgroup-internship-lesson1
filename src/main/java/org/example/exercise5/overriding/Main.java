package org.example.exercise5.overriding;

import org.example.exercise5.overriding.Animal;
import org.example.exercise5.overriding.Cat;
import org.example.exercise5.overriding.Dog;

public class Main {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound(); // Output: Dog barks
        cat.makeSound(); // Output: Cat meows
    }
}
