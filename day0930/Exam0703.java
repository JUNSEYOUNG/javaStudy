//switch case문 연습) 사용자한테 0~9 사이의 정수를 입력받아서
//한글표기식 출력하는 프로그램 작성
//<<실행 예>>
//0~9사이의 수를 입력하시오 ==> 7입력하면 칠 출력

import java.util.Scanner;
class Exam0703
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9사이의 수를 입력하세요.");
		n = sc.nextInt();                             
		switch(n){                                     //n에 0입력시 실행결과: 삼 종료 / 4입력시: 칠 종료 / 8입력시: 
			case 0:                                    //입력범위를 초과했습니다 종료 / 6입력시: 칠 종료  
			case 1:                                    //출력문이 없으면 출력문이 있는 곳으로 넘어감(break가 없으면 쭉 출력됨)                    
			case 2:
			case 3:System.out.println("삼");break;
			case 4:
			case 5:
			case 6:
			case 7:System.out.println("칠");break;
			case 8:
			case 9:
			default:System.out.println("입력범위를 초과했습니다.");

		}
		System.out.println("종료");
	}
}