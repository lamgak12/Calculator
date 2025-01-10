package com.example.calculator3;

import com.example.calculator3.operation.*;

public class Calculator {
    public <T extends Number> T calculate(T firstNumber, T secondNumber, OperatorSymbol operator){
        Operation<T> operation = getOperation(operator);
        return operation.operate(firstNumber,secondNumber);
    }
    private <T extends Number> Operation<T> getOperation(OperatorSymbol operator) {
        switch (operator) {
            case ADD:
                return new AddOperation<>();
            case SUBTRACT:
                return new SubtractOperation<>();
            case MULTIPLY:
                return new MultiplyOperation<>();
            case DIVIDE:
                return new DivideOperation<>();
            case MOD:
                return new ModularOperation<>();
            default:
                throw new IllegalArgumentException("알 수 없는 연산자입니다.");
        }
    }
}
