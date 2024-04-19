package org.example.exercise6;

public class Calculator {
    public double evaluate(String expression) {
        ExpressionEvaluator evaluator = new ExpressionEvaluator();
        return evaluator.evaluateExpression(expression);
    }
}
