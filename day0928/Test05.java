//연습) 사용자한테 임의의 수 n을 입력받아 그 수가 6의 배수인지
//판별하여 논리값(true,false)을 출력하는 프로그램 작성

import java.util.Scanner;
class Test05
{  
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("임의의 수 n을 입력하세요.");
		n = sc.nextInt();

		boolean result;
		result = n % 6 == 0;
			System.out.println(result);
	}
}
