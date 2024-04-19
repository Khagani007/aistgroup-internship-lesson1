package org.example.exercise8.creational.singleton;

public class Main {
    public static void main(String[] args) {

        Singleton singletonInstance1 = Singleton.getInstance();
        Singleton singletonInstance2 = Singleton.getInstance();

        System.out.println(singletonInstance1 == singletonInstance2);
        singletonInstance1.doSomething();
    }
}
