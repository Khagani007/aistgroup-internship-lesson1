package org.example.exercise8.structural.proxy;

public class RealSubjectImpl implements RealSubject {
    @Override
    public void request() {
        System.out.println("RealSubject: Handling request");
    }
}
