//비교연산자 연습) 학생의 이름(String문자열), 국어, 영어, 수학(int정수)을 입력받아 
//총점(정수)과 평균(double실수)을 구하고 평균이 60점 이상이면 구하여 출력한다음
//평균이 60점 이상이면 "합격", 그렇지않으면 "불합격"을
//출력하는 프로그램 작성 (단, 평균은 실수값으로 처리)

import java.util.Scanner;
class Exam02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, sum;
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		System.out.println("국어점수를 입력하세요.");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하세요.");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하세요.");
		math = sc.nextInt();

		sum = kor + eng + math;
		double avg;
		avg = (double)sum/(double)3;
		//avg = sum/3.0;

		System.out.println("**결과출력**");
		System.out.println("이름:" + name);
		System.out.println("국어:" + kor);
		System.out.println("영어:" + eng);
		System.out.println("수학:" + math);
		System.out.println("총점:" + sum);
		System.out.println("평균:" + avg);

		if(avg>=60)
		System.out.println("평균:" + avg + " 점으로 합격입니다.");
		else
		System.out.println("불합격입니다.");

	}
}
