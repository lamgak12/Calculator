package com.example.calculator3.operation;

public class DivideOperation<T extends Number> implements Operation<T> {
    @Override
    public T operate(T firstNumber, T secondNumber) {
        if (secondNumber.doubleValue() == 0) {
            throw new ArithmeticException("0으로 나눌 수 없습니다.");
        }

        if (firstNumber instanceof Double || secondNumber instanceof Double) {
            // 하나라도 Double이면 결과는 Double
            return (T) Double.valueOf(firstNumber.doubleValue() / secondNumber.doubleValue());
        } else if (firstNumber instanceof Integer && secondNumber instanceof Integer) {
            // 둘 다 Integer이면 결과는 Integer
            return (T) Integer.valueOf(firstNumber.intValue() / secondNumber.intValue());
        } else {
            throw new IllegalArgumentException("지원되지 않는 타입입니다.");
        }
    }
}
