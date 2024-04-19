package org.example.exercise8.behavioral.state;

public class StateB implements State {
    @Override
    public void handleRequest(Context context) {
        System.out.println("Handling request in State B");
        // Perform state-specific actions
        context.setState(new StateA());
    }
}
