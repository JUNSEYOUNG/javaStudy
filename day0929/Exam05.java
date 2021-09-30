//논리연산자 && || 연습) 학생의 이름, 국어, 영어, 수학을 입력받아
//국어점수가 90점 이상이고 평균점수가 90점 이상이면                ">~이고니까 논리곱&&사용하라는거네?" 
//장학금을 지급하려고 함
//장학금 지급여부를 판별하는 프로그램 작성

import java.util.Scanner;
class Exam05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("학생의 이름을 입력하세요.");
		name = sc.next();
		int kor, eng, math, sum;     //평균(avg)을 정수타입으로 얻으려면 여기에 avg넣기
		System.out.println("국어점수를 입력하세요.");
		kor = sc.nextInt();
        System.out.println("영어점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = sc.nextInt();

		sum = kor + eng + math;
		double avg;                //평균(avg)을 실수로 얻으려고 여기에 double로 선언함
		avg = (double)sum / 3;     //실수값 얻기 위한 캐스팅연산자()사용
		//avg = sum / 3.0;

		System.out.println("**출력결과**");
		System.out.println("이름:" + name);
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + math);
		System.out.println("총점:" + sum);
		System.out.println("평균:" + avg);


		if(kor >= 90 && avg >=90)
			System.out.println("장학금 지급대상자입니다.");
		else
			System.out.println("장학금 지급대상자가 아닙니다.");
	}
}
