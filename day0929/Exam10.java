//삼항연산자 연습) 사용자에게 임의의 수 n을 입력받아 짝수인지 홀수인지 판별하는 프로그램을
//삼항연산자를 이용해 작성

import java.util.Scanner;
class Exam10
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("임의의 수 n을 입력하세요.");
		n = sc.nextInt();

		System.out.println("**출력결과**");
		//System.out.println(n+"은" +((n%2==0)?"짝수":"홀수")+"입니다."); //출력문에 한번에 출력 //난이게좋아!
		String result = (n%2==0)?"짝수":"홀수";
		System.out.println(n+"은"  + result+ "입니다.");  //변수에 넣은 후 출력문에 사용
	}
}
