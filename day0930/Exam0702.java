//switch case문 연습) 사용자한테 0~9 사이의 정수를 입력받아서
//한글표기식 출력하는 프로그램 작성
//<<실행 예>>
//0~9사이의 수를 입력하시오 ==> 7입력하면 칠 출력

import java.util.Scanner;
class Exam0702
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9사이의 수를 입력하세요.");
		n = sc.nextInt();
		switch(n){                           //n에 3입력시 실행결과: 오
			case 0:System.out.println("영");
			case 1:System.out.println("일");
			case 2:System.out.println("이");
			case 3:System.out.println("삼");
			case 4:System.out.println("사");
			case 5:System.out.println("오");break;
			case 6:System.out.println("육");
			case 7:System.out.println("칠");break;
			case 8:System.out.println("팔");
			case 9:System.out.println("구");

		}
		System.out.println("종료");
	}
}