package com.example.calculator3;

import static com.example.calculator2.Run.sc;
public class InputHandler {

    public Number getNumber() {
        String input;
        while (true) {
            System.out.print("숫자를 입력하세요: ");
            input = sc.nextLine();

            try {
                if (input.contains(".")) {
                    return Double.parseDouble(input);
                } else {
                    return Integer.parseInt(input);
                }
            } catch (NumberFormatException e) {
                System.out.println("숫자 형식으로 다시 입력해주세요.");
            }
        }
    }

    public OperatorSymbol getOperator() {
        System.out.print("연산자를 입력하세요 (+, -, *, /, %): ");
        String symbol;
        while (true) {
            symbol = sc.nextLine().trim();
            try {
                // 유효한 연산자 기호일 경우, 그 값을 반환
                return OperatorSymbol.fromSymbol(symbol);
            } catch (IllegalArgumentException e) {
                // 잘못된 연산자 기호가 입력되면, 예외 처리 후 다시 입력 받기
                System.out.println("잘못된 연산자입니다. 다시 입력해주세요 (+, -, *, /, %): ");
            }
        }
    }
}
