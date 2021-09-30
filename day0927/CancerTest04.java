//연습)정부에서는 격년으로 40세이상인 사람들에게 무료암검진을 실시하고있다.
//이름과 출생연도를 입력받아 무료암검진 대상자인지 판별하여 결과 작성, 저장, 컴파일 후 실행
//<조건> 암검진 대상자는 40세 이상이고 
//올해가 짝수연도이면 짝수연도에 태어난사람
//올해가 홀수연도이면 홀수연도에 태어난사람

import java.util.Scanner;
import java.util.Date;

class CancerTest04{
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);
      Date today = new Date();
      String name;
      int userYear;
      int thisYear = today.getYear() + 1900;

      System.out.println("이름을 입력하세요.");
      name = sc.next();
      System.out.println("출생연도를 입력하세요.");
      userYear = sc.nextInt();

      int age = thisYear - userYear;
      if(age >= 40 && thisYear % 2  == userYear % 2)       
         System.out.println(thisYear + "년도에 무료 암검진 대상자입니다.");
      else
         System.out.println(thisYear + "년도에 무료 암검진 대상자가 아닙니다.");
      }
}