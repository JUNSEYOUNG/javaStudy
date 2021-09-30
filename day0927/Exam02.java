//연습)사용자로부터 x의 값을 실수로 입력받아서 다음과 같은 다항식의 값을 계산하는 프로그램작성
//3x(세제곱) - 7x(이제곱) + 9


import java.util.Scanner;

class Exam02{
  public static void main(String []args){
      Scanner sc = new Scanner(System.in);

      double x;
      System.out.println("실수x를 입력하세요.");
      x = sc.nextDouble();
     //  double r = 3*x*x*x - 7*x*x + 9;
     double r = 3*Math.pow(x,3) - 7*Math.pow(x,2) + 9;
      System.out.println("결과:" + r);
  }
}
