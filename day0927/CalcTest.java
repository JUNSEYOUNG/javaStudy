//연습) 사용자한테 두개의 정수를 입력받아 
//더하기, 빼기, 곱하기, 나누기 한 결과를 
//출력하는 프로그램을 작성, 저장, 컴파일, 실행해 봅니다

import java.util.Scanner;

class CalcTest{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int first, second, add, sub, multi, div;

       System.out.println("첫번째 수를 입력하세요.");
       first = sc.nextInt();
       System.out.println("두번째 수를 입력하세요.");
       second = sc.nextInt();
       add = first + second;
       sub = first - second;
       multi = first * second;
       div = first / second;

       System.out.println(" ** 결과 출력 ** ");
       System.out.println("더하기:" + add);
       System.out.println("빼기:" + sub);
       System.out.println("곱하기:" + multi);
       System.out.println("나누기:" + div);
  }
}
