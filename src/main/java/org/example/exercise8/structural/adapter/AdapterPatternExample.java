package org.example.exercise8.structural.adapter;

public class AdapterPatternExample {
        public static void main(String[] args) {

            Adaptee adaptee = new Adaptee();
            Target adapter = new Adapter(adaptee);

            adapter.request();
        }
    }
