package com.example.calculator3.operation;

import static java.lang.Double.NaN;

public class ModularOperation<T extends Number> implements Operation<T> {
    @Override
    public T operate(T firstNumber, T secondNumber) {
        // secondNumber를 Double로 변환하여 0인지 확인
        if (secondNumber.doubleValue() == 0) {
            // secondNumber가 Double일 경우 NaN 반환
            if (secondNumber instanceof Double) {
                return (T) Double.valueOf(NaN); // Double.NaN 반환
            } else if(secondNumber instanceof Float) {
                return (T) Float.valueOf(Float.NaN);
            }else {
                return (T) Double.valueOf(NaN);
            }
        }
        if (firstNumber instanceof Double || secondNumber instanceof Double) {
            // 하나라도 Double이면 결과는 Double
            return (T) Double.valueOf(firstNumber.doubleValue() / secondNumber.doubleValue());
        } else {
            // 둘 다 Integer이면 결과는 Integer
            return (T) Integer.valueOf(firstNumber.intValue() / secondNumber.intValue());
        }
    }
}
