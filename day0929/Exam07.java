//비트연산자 & | ^ 중 비트곱 (&) 연산자 사용) 두 사람의 나이를 입력받아
//두 사람 모두 20살 이상인지 판별하여
//적합한 메세지를 출력하는 프로그램 작성
//(비트연산자를 논리연산자 && || 로 이용)

import java.util.Scanner;
class Exam07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2;
		System.out.println("첫번째 사람의 나이를 입력하세요.");
		age1 = sc.nextInt();
		System.out.println("두번째 사람의 나이를 입력하세요.");
		age2 = sc.nextInt();


        System.out.println("**출력결과**");
		System.out.println("age1:"+age1);
		System.out.println("age2:"+age2);
		
		if(age1 >= 20 & age2 >= 20)   //& && 둘다가능
			System.out.println("두 사람의 나이는 모두 20살 이상입니다.");
		else
			System.out.println("두 사람의 나이는 모두 20살 이상이 아닙니다.");
	}
}
