package com.example.calculator3;

import static com.example.calculator3.Run.sc;

public class InputNumber {

    public int getNumber(){
        System.out.print("숫자를 입력하세요: ");
        while (!sc.hasNextInt()){
            System.out.println("유효하지 않은 숫자입니다. 다시 입력하세요");
            System.out.print("숫자를 입력하세요: ");
            sc.nextLine();
        }
        return sc.nextInt();
    }
}
