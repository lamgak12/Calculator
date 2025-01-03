package com.example.calculator1;


import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("=== 계산기 프로그램 ===");
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("계산 할 기호를 입력해주세요.");
            System.out.println("기호 목록: +, -, *, /, %");
            String operator = sc.nextLine();
            if (operator.equals("+")) {
                System.out.print("첫 번째 숫자를 입력해주세요: ");
                int firstNumber = sc.nextInt();
                System.out.print("두 번째 숫자를 입력해주세요: ");
                int secondNumber = sc.nextInt();
                sc.nextLine();
                System.out.println(firstNumber + " + " + secondNumber + "의 값은 : " + (firstNumber + secondNumber) + " 입니다.");
            } else if (operator.equals("-")){
                System.out.print("첫 번째 숫자를 입력해주세요: ");
                int firstNumber = sc.nextInt();
                System.out.print("두 번째 숫자를 입력해주세요: ");
                int secondNumber = sc.nextInt();
                sc.nextLine();
                System.out.println(firstNumber + " - " + secondNumber + "의 값은 : " + (firstNumber - secondNumber) + " 입니다.");
            } else if (operator.equals("*")) {
                System.out.print("첫 번째 숫자를 입력해주세요: ");
                int firstNumber = sc.nextInt();
                System.out.print("두 번째 숫자를 입력해주세요: ");
                int secondNumber = sc.nextInt();
                sc.nextLine();
                System.out.println(firstNumber + " * " + secondNumber + "의 값은 : " + (firstNumber * secondNumber) + " 입니다.");
            } else if (operator.equals("/")) {
                System.out.print("첫 번째 숫자를 입력해주세요: ");
                int firstNumber = sc.nextInt();
                System.out.print("두 번째 숫자를 입력해주세요: ");
                int secondNumber = sc.nextInt();
                sc.nextLine();
                System.out.println(firstNumber + " / " + secondNumber + "의 값은 : " + (firstNumber / secondNumber) + " 입니다.");
            } else if (operator.equals("%")){
                System.out.print("첫 번째 숫자를 입력해주세요: ");
                int firstNumber = sc.nextInt();
                System.out.print("두 번째 숫자를 입력해주세요: ");
                int secondNumber = sc.nextInt();
                sc.nextLine();
                System.out.println(firstNumber + "%" + secondNumber + "의 값은 : " + (firstNumber % secondNumber) + " 입니다.");
            }
            while (true) {
                System.out.print("계속 계산 하시겠습니까?(yes / exit): ");
                String userChoice = sc.nextLine().toLowerCase();
                if (userChoice.equals("yes")) {
                    break;
                } else if (userChoice.equals("exit")) {
                    System.out.println("프로그램을 종료합니다.");
                    return;
                } else {
                    System.out.println("올바른 입력이 아닙니다. yes 또는 exit를 입력해주세요.");
                }
            }
        }
    }
}
