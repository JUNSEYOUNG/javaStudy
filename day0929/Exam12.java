//조별연습)1파운드는 454그램이다. 몸무게를 파운드로 받아서 그램으로 환산하여 출력하는 프로그램 작성
//변수들의 자료형은 어떤 것을 선택하는 것이 좋은가?
//1파운드당 그램을 나타내라

import java.util.Scanner;
class Exam12 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double p;       //몸무게니까 소수점까지 입력하려고 실수 Double타입 사용함
        System.out.println("몸무게를 파운드로 입력하세요.");
		p = sc.nextDouble();

		System.out.println("당신의 몸무게는" + p*454+ "g입니다.");
	}
}
