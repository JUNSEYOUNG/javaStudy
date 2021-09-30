//switch case문 연습) 사용자한테 0~9 사이의 정수를 입력받아서
//한글표기식 출력하는 프로그램 작성
//<<실행 예>>
//0~9사이의 수를 입력하시오 ==> 7입력하면 칠 출력

import java.util.Scanner;
class Exam0705
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9사이의 수를 입력하세요.");
		n = sc.nextInt();
		int(n<0 || n>9){                            //n의 값을 받아서 바람직하지 않은지 검사해보겠음
			System.out.println("입력 범위를 초과했습니다.");
		}else{                                      //else일 때 아래 전체를 만나보도록 해보겠음
			
		String result = "";
		switch(n){
			case 0:result = "영";break;              //case문에 변수의 값을 정하는 코딩
			case 1:result = "일";break;
			case 2:result = "이";break;
			case 3:result = "삼";break;
			case 4:result = "사";break;
			case 5:result = "오";break;
			case 6:result = "육";break;
			case 7:result = "칠";break;
			case 8:result = "팔";break;
			case 9:result = "구";break;
		}
		System.out.println(result);
		}
	}
}