package org.example.exercise8.structural.proxy;

public class Proxy implements RealSubject {
    private RealSubject realSubject;

    public Proxy() {
        this.realSubject = null;
    }

    private void lazyInitialize() {
        if (realSubject == null) {
            realSubject = new RealSubjectImpl();
        }
    }

    @Override
    public void request() {
        lazyInitialize();
        System.out.println("Proxy: Performing additional logic before delegating to RealSubject");
        realSubject.request();
    }
}
