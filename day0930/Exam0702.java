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
		switch(n){                           //n에 3입력시 실행결과: 삼 종료 / 0입력시: 영일이삼 종료 / 6입력시: 육칠 종료
			case 0:System.out.println("영");  //n에 입력하는 수부터 break문이 끝나는 case까지 출력됨. 종료는 switch문
			case 1:System.out.println("일");  //밖에 있어서 무조건 출력되게 되어있음
			case 2:System.out.println("이");
			case 3:System.out.println("삼");break;
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