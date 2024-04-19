package org.example.exercise8.behavioral.state;



public class Context {
    private State currentState;

    public Context() {

        currentState = new StateA();
    }

    public void setState(State state) {
        this.currentState = state;
    }

    public void request() {
        currentState.handleRequest(this);
    }
}
