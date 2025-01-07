package com.example.calculator2;

public class Calculator {
    public int calculate(int firstNumber, int secondNumber, String operator){
        switch (operator){
            case "+":
                return firstNumber + secondNumber;
            case "-":
                return firstNumber - secondNumber;
            case "*":
                return firstNumber * secondNumber;
            case "/":
                if(secondNumber == 0){
                    System.out.println("0으로 나눌 수 없습니다.");
                    return Integer.MIN_VALUE;
                }
                return firstNumber / secondNumber;
            case "%":
                if(secondNumber == 0){
                    System.out.println("정의되지 않은 결과입니다.");
                    return Integer.MIN_VALUE;
                }
                return firstNumber % secondNumber;
            default:
                throw new IllegalStateException("알 수 없는 연산자 입니다.");
        }
    }
}
