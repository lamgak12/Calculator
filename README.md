# 📟프로젝트 소개

---

![img](https://github.com/user-attachments/assets/c56b83f1-ec28-453c-bf6e-a43643dabe27)


#### 프로젝트 이름 : 단계별 계산기 구현
#### 프로젝트 목적 : 학습한 자바 문법의 활용 능력 강화
#### 프로젝트 개요 : CLI기반의 사칙연산이 가능한 계산기를 구현, 원하는 기능은 자유롭게 추가 가능
#### 프로젝트 기간 : 2024.12.31 ~ 2025.01.09
#### 개발 환경 : 언어 - java 17, IDE - IntelliJ, 버전관리 - github, gitbash
#### 기능 소개 : 작성 예정

---

## 폴더 구조

---
```
└─ 📟calculator
    └─ 📁 src/main/java/com/example
       ├─ 📂 calculator1
       │  └─ ☕ Calculator
       ├─ 📂 calculator2
       │  ├─ ☕ Calculator
       │  ├─ ☕ InputNumber
       │  ├─ ☕ InputOperator
       │  ├─ ☕ Main
       │  ├─ ☕ ResultPrinter
       │  ├─ ☕ ResultStorage
       │  └─ ☕ Run
       └─ 📂 calculator3
          ├─ 📂 operation
          │  ├─ ☕ AddOperation
          │  ├─ ☕ DivideOperation
          │  ├─ ☕ ModularOperation
          │  ├─ ☕ MultiplyOperation
          │  ├─ ☕ Operation
          │  └─ ☕ SubtractOperation
          ├─ ☕ Calculator
          ├─ ☕ InputHandler
          ├─ ☕ Main
          ├─ ☕ OperationSymbol
          ├─ ☕ ResultPrinter
          ├─ ☕ ResultStorage
          └─ ☕ Run

```
---
## 요구사항

---

### Lv1 클래스 없이 기본적인 연산을 수행할 수 있는 계산기

- 양의 정수(0 포함)를 입력받기
    - Scanner를 사용하여 양의 정수 2개(0 포함)를 전달 받을 수 있다.
    - 양의 정수는 각각 하나씩 전달 받는다.
    - 양의 정수는 적합한 타입으로 선언한 변수에 저장한다.
- 사칙연산 기호를 입력받기
  - Scanner를 사용하여 사칙연산 기호를 전달 받을 수 있다.
  - 사칙연산 기호를 선언한 변수에 저장한다. (charAt(0))
- 위에서 입력받은 양의 정수 2개와 사칙연산 기호를 사용하여 연산을 진행한 후 결과값을 출력하기
  - 사칙연산 기호에 맞는 연산자를 사용하여 연산을 진행한다.
  - 입력받은 연산 기호를 구분하기 위해 제어문을 사용한다.
- 연산 오류가 발생할 경우 해당 오류에 대한 내용을 출력한다.
  - 반복문을 사용하되, 반복의 종료를 알려주는 “exit” 문자열을 입력하기 전까지 무한으로 계산을 진행할 수 있다.


### Lv2 클래스를 적용해 기본적인 연산을 수행할 수 있는 계산기

- 사칙연산을 수행 후, 결과값 반환 메서드 구현 & 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성
  - 사칙연산을 수행한 후, 결과값을 반환하는 메서드 구현한다
  - 연산 결과를 저장하는 컬렉션 타입 필드를 가진 Calculator 클래스를 생성한다
  - 양의 정수 2개(0 포함)와 연산 기호를 매개변수로 받아 사칙연산 결과 값을 반환하는 메서드와 연산 결과를 저장한다.
- Lv 1에서 구현한 App 클래스의 main 메서드에 Calculator 클래스가 활용될 수 있도록 수정
  - 연산 수행 역할은 Calculator 클래스가 담당한다.
  - 연산 결과는 Calculator 클래스의 연산 결과를 저장하는 필드에 저장한다.
  - App 클래스의 main 메서드에서 Calculator 클래스의 연산 결과를 저장하고 있는 컬렉션 필드에 직접 접근하지 못하도록 수정한다. (캡슐화)
  - Calculator 클래스에 저장된 연산 결과들 중 가장 먼저 저장된 데이터를 삭제하는 기능을 가진 메서드를 구현한 후 App 클래스의 main 메서드에 삭제 메서드가 활용될 수 있도록 한다.

### Lv3 Enum, 제네릭, 람다 & 스트림을 이해한 게산기 만들기 - 선택 사항

- Enum을 활용해 연산자 기호를 관리하고 사칙연산 클래스에 활용한다.
- 실수 값을 전달 받아도 연산이 수행되도록 한다.
- 저장된 연산 결과들 중 입력받은 값보다 큰 결과 값들을 출력한다.

---

## 최종 구현 현황판

--- 
![img_1](https://github.com/user-attachments/assets/f5241fab-4be4-4898-aee5-7ac91933cae3)


---

## 클래스 다이어그램 - Lv. 3

---
![img_3](https://github.com/user-attachments/assets/7a622d3e-9456-490e-9132-2113dfa48284)


---
## 구현 결과 - Lv. 3

---
![img_4](https://github.com/user-attachments/assets/b58ab8c5-92e9-4e0c-951e-7c5cbf076013)  


![img_5](https://github.com/user-attachments/assets/d0678ccb-3010-498b-bfdc-bce2b0e1ca12)  


![img_6](https://github.com/user-attachments/assets/4915f598-701b-4674-8b98-df0e25b0f021)  

![img_7](https://github.com/user-attachments/assets/2fd89bc3-62e2-45d7-b9c6-00de9630ca4e)  



---
## 좋았던 점
배웠던 문법들을 상황에 맞게 활용하고자 고민하여 사용하며 코드를 작성할 수 있어서 좋았음

---

## 아쉬운 점
제네릭, 예외 처리 활용 능력 미흡
람다 & 스트림 개념 이해 부족
