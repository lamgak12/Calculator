package com.example.calculator3;

import static com.example.calculator3.Run.sc;

public class InputOperator {
    public String getOperator(){
        System.out.print("연산자를 입력하세요 (+, -, *, /, %): ");
        String operator = sc.nextLine();

        while (true){
            switch (operator){
                case "+":
                case "-":
                case "*":
                case "/":
                case "%":
                    return operator;
                default:
                    System.out.println("유효하지 않은 연산자입니다. 다시 입력하세요");
                    System.out.print("연산자를 입력하세요 (+, -, *, /, %): ");
                    operator = sc.nextLine();
            }
        }
    }
}
