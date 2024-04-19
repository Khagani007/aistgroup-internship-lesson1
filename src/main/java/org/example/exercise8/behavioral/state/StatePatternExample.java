package org.example.exercise8.behavioral.state;

public class StatePatternExample {
    public static void main(String[] args) {
        Context context = new Context();


        context.request();
        context.request();
        context.request();
    }
}
