//연습)자신의 이름과 나이를 출력하는 프로그램을 작성,저장,컴파일,실행해봅니다. 

import java.util.Scanner;

class YourInfo{
   public static void main(String []args){
     Scanner sc = new Scanner(System.in);

     String name;
     int age;
     System.out.println("당신의 이름은 무엇인가요?");
     name = sc.next();
     System.out.println("당신의 나이는 몇살인가요?");
     age = sc.nextInt();
     System.out.println("반갑습니다! 당신의 이름은 "+name+"이고, 나이는 "+age+ "살이군요");
  }
}