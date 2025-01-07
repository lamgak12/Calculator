package com.example.calculator2;

public class ResultPrinter {
    public void printResult(int firstNumber, int secondNumber,
                            String operator, int result){
        System.out.println(firstNumber + " " + operator + " " + secondNumber + " 의 결과는 " +  result + " 입니다.");
    }
}
