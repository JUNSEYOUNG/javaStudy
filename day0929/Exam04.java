//비교연산자 연습)두사람의 나이를 입력받아 서로 같은지 판별하여
//적합한 메시지를 출력하는 프로그램 작성
//(클래스이름, 변수명, 출력메시지는 자유롭게 함)

import java.util.Scanner;
class Exam04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2;
		System.out.println("첫번째 사람의 나이를 입력하세요.");
		age1 = sc.nextInt();
		System.out.println("두번째 사람의 나이를 입력하세요.");
	    age2 = sc.nextInt();

		if(age1 == age2)
	    System.out.println("두 사람은 친구입니다.");
		else
	    System.out.println("두 사람은 친구가 아닙니다.");
	}
}
