//비교연산자 연습) 사용자에게 두개의 정수를 입력받아 그 중에 작은 수를 찾아서
//출력하는 프로그램을 작성

import java.util.Scanner;
class Exam01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, min;
		System.out.println("첫번째 정수를 입력하세요.");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		b = sc.nextInt();

		if(a < b)
			min = a;
		else
			min = b;
		System.out.println("작은 수는" + min + "입니다.");
	}
}
