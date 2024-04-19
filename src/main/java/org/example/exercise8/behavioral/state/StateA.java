package org.example.exercise8.behavioral.state;

public class StateA implements State {
    @Override
    public void handleRequest(Context context) {
        System.out.println("Handling request in State A");
        context.setState(new StateB()); // Transition to the next state
    }
}
