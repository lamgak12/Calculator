package com.example.calculator3;

import java.util.ArrayList;

import static com.example.calculator2.Run.sc;


public class ResultStorage {
    private ArrayList<String> results = new ArrayList<>();
    public boolean askSave(){
        System.out.println("결과를 저장하시겠습니까? (yes / no)");
        String answer = sc.nextLine();
        while (true){
            if("yes".equalsIgnoreCase(answer)){
                return true;
            }else if("no".equalsIgnoreCase(answer)){
                return false;
            } else {
                System.out.println("틀린 입력입니다. 다시 입력해주세요.(yes / no)");
                answer = sc.nextLine();
            }
        }
    }

    public void getResult(){
        System.out.println("저장된 결과를 조회합니다.");
        if(results.isEmpty()){
            System.out.println("결과가 없습니다.");
        }
        for(int i = 0; i < results.size(); i++){
            System.out.printf("%d번 %s\n", (i+1), results.get(i));
        }
    }

    public void saveResult(Number firstNumber, Number secondNumber, OperatorSymbol operator, Number result){
        results.add(firstNumber + " " + operator.getSymbol() + " " + secondNumber + " = " + result);
        System.out.println("성공적으로 저장되었습니다.");
    }
    public void deleteResult(){
        if(results.isEmpty()){
            System.out.println("결과가 없습니다.");
            return;
        }
        System.out.println("리스트는 총 " + results.size() + "개 만큼 있습니다.");

        int index = -1;

        while (true){
            System.out.print("삭제할 결과의 번호를 입력해주세요: ");

            if(!sc.hasNextInt()){
                System.out.println("유효하지 않은 입력입니다. 숫자를 입력해주세요.");
                sc.nextLine();
                continue;
            }

            index = sc.nextInt();

            if(index >= 1 && index <= results.size()){
                break;
            }else {
                System.out.println("입력한 숫자 "+index+"은(는) 결과 리스트의 범위를 벗어납니다.");
                System.out.println("다시 입력해주세요.");
                sc.nextLine();
            }
        }

        results.remove(index - 1);
        System.out.println("성공적으로 삭제되었습니다.");
    }
}
