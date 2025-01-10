package com.example.calculator3;

public class ResultPrinter {
    public void printResult(Number firstNumber, Number secondNumber,
                            OperatorSymbol operator, Number result){
        System.out.println(firstNumber + " " + operator.getSymbol() + " " + secondNumber + " 의 결과는 " +  result + " 입니다.");
    }
}
