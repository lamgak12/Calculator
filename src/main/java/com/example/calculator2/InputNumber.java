package com.example.calculator2;

import static com.example.calculator2.Run.sc;

public class InputNumber {

    public int getNumber(){
        System.out.print("숫자를 입력하세요: ");
        while (!sc.hasNextInt()){ //숫자가 아닌경우
            System.out.println("유효하지 않은 숫자입니다. 다시 입력하세요");
            System.out.print("숫자를 입력하세요: ");
            sc.nextLine();
        }
        //숫자일 경우
        return sc.nextInt();
    }
}
