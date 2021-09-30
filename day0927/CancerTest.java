//연습) 정부에서는 매년 40세 이상인 사람들에게 무료암검진을 실시하고
//있습니다. 이름과 나이를 입력받아 무료암검진 대상자인지 판별하여 
//결과를 출력하는 프로그램을 작성하고, 저장하고, 컴파일하여 
//실행해 봅니다. (클래스이름, 변수명 등은 자유롭게 합니다.)

import java.util.Scanner;

class CancerTest{
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);

      String name;
      int age;
      System.out.println("이름을 입력하세요.");
      name = sc.next();
      System.out.println("나이를 입력하세요.");
      age = sc.nextInt(); 

      if(age >= 40)
      System.out.println("무료암검진 대상자입니다.");
      else
      System.out.println("무료암검진 대상자가 아닙니다.");
 }
}