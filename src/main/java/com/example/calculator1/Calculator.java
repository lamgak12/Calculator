package com.example.calculator1;


import java.util.Scanner;

public class Calculator {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int[] numbers = new int[2];
        System.out.println("=== 계산기 프로그램 ===");
        while (true) {
            System.out.println("계산 할 기호를 입력해주세요.");
            System.out.println("기호 목록: +, -, *, /, %");
            String operator = sc.nextLine();
            if (operator.equals("+")) {
                inputNumbers(numbers);
                int result = add(numbers[0], numbers[1]);
                printResult(operator, numbers, result);
            } else if (operator.equals("-")){
                inputNumbers(numbers);
                int result = subtract(numbers[0],numbers[1]);
                printResult(operator, numbers, result);
            } else if (operator.equals("*")) {
                inputNumbers(numbers);
                int result = multiply(numbers[0],numbers[1]);
                printResult(operator, numbers, result);
            } else if (operator.equals("/")) {
                inputNumbers(numbers);
                int result = division(numbers[0],numbers[1]);
                printResult(operator, numbers, result);
            } else if (operator.equals("%")){
                inputNumbers(numbers);
                int result = modulo(numbers[0], numbers[1]);
                printResult(operator, numbers, result);
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
    public static void printResult(String operator, int[] numbers, int result){
        System.out.println(numbers[0] + operator + numbers[1] + "의 값은 : " + result + " 입니다.");
    }
    public static void inputNumbers(int[] numbers){
        System.out.print("첫 번째 숫자를 입력해주세요: ");
        numbers[0] = sc.nextInt();
        System.out.print("두 번째 숫자를 입력해주세요: ");
        numbers[1] = sc.nextInt();
        sc.nextLine();
    }

    public static int add(int firstNumber, int secondNumber){
        return firstNumber + secondNumber;
    }
    public static int subtract(int firstNumber, int secondNumber){
        return firstNumber - secondNumber;
    }
    public static int multiply(int firstNumber, int secondNumber){
        return firstNumber * secondNumber;
    }
    public static int division(int firstNumber, int secondNumber){
        return firstNumber / secondNumber;
    }
    public static int modulo(int firstNumber, int secondNumber){
        return firstNumber % secondNumber;
    }
}
