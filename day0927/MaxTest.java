//연습)사용자에게 두개의 정수를 입력받아 그 중 큰수를 찾아 출력하는 프로그램 작성
//여기서는 a가 크냐 b가 크냐가 아니라 그냥 큰수를 찾아서 출력하는 것임.

import java.util.Scanner;

class MaxTest{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int a, b, max;
       System.out.println("첫번째 수를 입력하세요.");
       a = sc.nextInt();
       System.out.println("두번째 수를 입력하세요.");
       b = sc.nextInt();

     if(a>=b)
       max = a;
     else
       max = b;
     System.out.println("큰수는 "+ max +"입니다.");
  }
}