package org.example.exercise8.structural.proxy;

public class ProxyPatternExample {
    public static void main(String[] args) {
        RealSubject proxy = new Proxy();
        proxy.request();
    }
}
