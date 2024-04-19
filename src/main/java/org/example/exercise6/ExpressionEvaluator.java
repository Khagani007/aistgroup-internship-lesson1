package org.example.exercise6;

public class ExpressionEvaluator {
    public double evaluateExpression(String expression) {
        OperandStack operands = new OperandStack();
        OperatorStack operators = new OperatorStack();

        int i = 0;
        while (i < expression.length()) {
            if (Character.isDigit(expression.charAt(i)) || (expression.charAt(i) == '-' && (i == 0 || isOperator(expression.charAt(i - 1))))) {
                StringBuilder operandBuilder = new StringBuilder();
                while (i < expression.length() && (Character.isDigit(expression.charAt(i)) || expression.charAt(i) == '.' || (expression.charAt(i) == '-' && operandBuilder.length() == 0))) {
                    operandBuilder.append(expression.charAt(i++));
                }
                operands.push(Double.parseDouble(operandBuilder.toString()));
            } else if (isOperator(expression.charAt(i))) {
                while (!operators.isEmpty() && precedence(expression.charAt(i)) <= precedence(operators.peek())) {
                    double operand2 = operands.pop();
                    double operand1 = operands.pop();
                    char operator = operators.pop();
                    operands.push(applyOperation(operator, operand1, operand2));
                }
                operators.push(expression.charAt(i));
                i++;
            } else if (expression.charAt(i) == '(') {
                int openParenCount = 1;
                int j = i + 1;
                while (j < expression.length() && openParenCount != 0) {
                    if (expression.charAt(j) == '(')
                        openParenCount++;
                    else if (expression.charAt(j) == ')')
                        openParenCount--;
                    j++;
                }
                String subExpression = expression.substring(i + 1, j - 1);
                operands.push(evaluateExpression(subExpression));
                i = j;
            } else {
                i++;
            }
        }


        while (!operators.isEmpty()) {
            double operand2 = operands.pop();
            double operand1 = operands.pop();
            char operator = operators.pop();
            operands.push(applyOperation(operator, operand1, operand2));
        }


        return operands.pop();
    }

    private boolean isOperator(char c) {
        return c == '+' || c == '-' || c == '*' || c == '/';
    }

    private int precedence(char operator) {
        if (operator == '+' || operator == '-') {
            return 1;
        } else if (operator == '*' || operator == '/') {
            return 2;
        }
        return 0;
    }

    private double applyOperation(char operator, double operand1, double operand2) {
        switch (operator) {
            case '+':
                return operand1 + operand2;
            case '-':
                return operand1 - operand2;
            case '*':
                return operand1 * operand2;
            case '/':
                if (operand2 == 0) {
                    throw new ArithmeticException("Division by zero!");
                }
                return operand1 / operand2;
            default:
                return 0;
        }
    }
}