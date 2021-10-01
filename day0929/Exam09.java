//삼항연산자 (항1)?항2:항3 연습) 사용자에게 두개의 정수를 입력받아 그중에 작은수를 찾아 출력하는 프로그램을
//삼항연산자를 이용해 작성

import java.util.Scanner;
class Exam09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;                                  //int a, b, min;
		System.out.println("첫번째 수를 입력하세요.");
		a = sc.nextInt();
		System.out.println("두번째 수를 입력하세요.");
		b = sc.nextInt();

        System.out.println("**작은 수 출력결과**");   //min = (a<b)?a:b;
		System.out.println((a<b)?a:b);           //("작은 수는"+min+"입니다."); //변수에 넣어서 출력하는 방법
	}
}
