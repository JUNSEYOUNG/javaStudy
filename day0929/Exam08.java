//비트연산자 비트곱(&)과 논리연산자 논리곱(&&) 비교

import java.util.Scanner;
class Exam08 
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
		
		if(++age1 >= 20 && ++age2 >= 20)   
		//& && 둘다가능한데 &&은 첫번째 조건식이 거짓이면 두번째 조건식은 실행하지 않으므로 짧은 연산을 수행함 
			System.out.println("두 사람의 나이를 1씩 증가하면 두 사람 모두 스무살 이상입니다.");
		else
			System.out.println("두 사람의 나이를 1씩 증가하면 두 사람 모두 스무살 이상이 아닙니다.");
	}
}
