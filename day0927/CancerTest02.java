//연습) 정부에서는 매년 40세 이상인 사람들에게 무료암검진을 실시하고
//있습니다. 이름과 출생연도를 입력받아 나이를 계산하고 
//나이가 40살 이상인지 판별하여 무료암검진 대상자인지 아닌지 
//결과를 출력하는 프로그램을 작성, 저장, 컴파일하여 
//실행해 봅니다. (나이: 올해연도(2021) - 출생연도로 처리합니다.)

import java.util.Scanner;

class CancerTest02{
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);

      String name;
      int age, userYear;
      int thisYear;
      thisYear = 2021;
     
      System.out.println("이름을 입력하세요.");
      name = sc.next();
      System.out.println("출생연도를 입력하세요.");
      userYear = sc.nextInt(); 
      
      age = thisYear - userYear;
      if(age >= 40)
      System.out.println(name+"님, 올해에 " + age +" 세입니다. 무료암검진 대상자입니다.");
      else
      System.out.println(name+"님, 올해에 " + age +" 세입니다. 무료암검진 대상자가 아닙니다.");
 }
}