package com.example.calculator3;

import java.util.Scanner;

public class Run {
    public static Scanner sc = new Scanner(System.in);
    public void start() {
        InputHandler inputHandler = new InputHandler(); //제네릭에 어떤 타입을 사용할지 모르는 상황
        Calculator<Number> calculator = new Calculator<>(Number.class);
        ResultPrinter resultPrinter = new ResultPrinter();
        ResultStorage resultStorage = new ResultStorage();
        System.out.println("=== 계산기 프로그램 ===");
        while (true){
            System.out.println("메뉴를 선택해주세요 (숫자로)");
            System.out.println("1. 계산하기 | 2. 결과 불러오기 | 3. 결과 삭제하기 | 4. 종료");

            int option = -1;

            while (option == -1) {
                try {
                    option = sc.nextInt();
                    sc.nextLine();
                } catch (Exception e) {
                    System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
                    sc.nextLine(); // 버퍼 비우기
                    System.out.println("메뉴를 선택해주세요 (숫자로)");
                    System.out.println("1. 계산하기 | 2. 결과 불러오기 | 3. 결과 삭제하기 | 4. 종료");
                }
            }

            switch (option){
                case 1:
                    System.out.println("1. 계산하기 선택");
                    System.out.println("계산을 시작합니다.");
                    OperatorSymbol operator = inputHandler.getOperator(); //타입이 정해짐
                    Number firstNumber = inputHandler.getNumber(); //숫자 타입이 정해짐
                    Number secondNumber = inputHandler.getNumber();
                    
                    Number result = calculator.calculate(firstNumber, secondNumber, operator);
                    if (result instanceof Double && Double.isNaN(((Double) result))) {
                        System.out.println("잘못된 계산입니다. 처음으로 돌아갑니다.");
                        continue;
                    }

                    resultPrinter.printResult(firstNumber, secondNumber, operator, result);
//
                    if(resultStorage.askSave()){
                        resultStorage.saveResult(firstNumber, secondNumber, operator, result);
                    }
                    break;
                case 2:
                    System.out.println("2. 결과 불러오기 선택");
                    System.out.println("결과를 불러옵니다.");
                    resultStorage.getResult();
                    break;
                case 3:
                    System.out.println("3. 결과 삭제하기 선택");
                    resultStorage.deleteResult();
                    break;
                case 4:
                    System.out.println("4. 종료 선택");
                    System.out.println("시스템을 종료합니다.");
                    sc.close();
                    return;
                default:
                    System.out.println("숫자를 입력해주세요.");
            }
        }
    }
}
