//switch case문 연습) 사용자한테 0~9 사이의 정수를 입력받아서   
//한글표기식 출력하는 프로그램 작성
//<<실행 예>>
//0~9사이의 수를 입력하시오 ==> 7입력하면 칠 출력

import java.util.Scanner;
class Exam07
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9사이의 수를 입력하세요.");
		n = sc.nextInt();
		switch(n){                                       //break의 역할 알기 ex)2입력: 이삼 / 4입력: 사 / 6입력: 육칠
			case 0:System.out.println("영");              //case 넘버:출력문(내용);break써도 되고 안 써도 되고!
			case 1:System.out.println("일");break;
			case 2:System.out.println("이");
			case 3:System.out.println("삼");break;
			case 4:System.out.println("사");break;
			case 5:System.out.println("오");
			case 6:System.out.println("육");
			case 7:System.out.println("칠");break;
			case 8:System.out.println("팔");
			case 9:System.out.println("구");
			default:System.out.println("입력범위를 초과했습니다.");

		}
	}
}
