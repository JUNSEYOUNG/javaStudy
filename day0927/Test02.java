//1번 과제)어떤 학생이 이번 학기에 컴퓨터개론, c언어 프로그래밍, 영어, 일반 수학을 수강신청했다고 하자.
//각 과목의 점수를 입력하면 그 학생의 이번 학기 평균 점수를 계산하는 프로그램을 작성해라.

import java.util.Scanner;

class Test02{
    public static void main(String []args){
    Scanner sc = new Scanner(System.in);
 
    int com, clang, eng, math;

   System.out.println("컴퓨터개론 점수는 몇점인가요?");
   com = sc.nextInt();
   System.out.println("c언어 프로그래밍 점수는 몇점인가요?");
   clang = sc.nextInt();
   System.out.println("영어 점수는 몇점인가요?");
   eng = sc.nextInt();
   System.out.println("일반 수학 점수는 몇점인가요?");
   math = sc.nextInt();

   System.out.println(" ** 결과 출력 ** ");
   System.out.println("컴퓨터개론:" + com);
   System.out.println("c언어 프로그래밍:" + clang);
   System.out.println("영어:" + eng);
   System.out.println("일반수학:" + math);
   System.out.println("총점:" + (com+clang+eng+math));
   System.out.println("평균:" + (com+clang+eng+math)/4);
   }
}

