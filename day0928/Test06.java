//연습) 10000보다 작은 정수를 입력받아서 이것을 천, 백, 십, 일의 자리로 분리하여
//출력하는 프로그램 작성
//사용자가 정수 5623을 입력하면 5,6,2,3을 차례로 출력하면 됨
//나눗셈과 나머지 연산 사용하기
//정수를 입력하시오: 5623
//천의 자리: 5
//백의 자리: 6
//십의 자리: 2
//일의 자리: 3

import java.util.Scanner;
class Test06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,div,div1,mode1,div2,mode2,div3,mode3;
		System.out.print("10000 미만의 정수를 입력하세요.");
		n = sc.nextInt();

		div1 = n/1000; //5
		model1 = n%1000; //623
		div2 = model/100; //6
		mode2 = model%100; //23
		div3 = mode2/10; //2
		mode3 = mode2%10; //3

		System.out.println("천의 자리:" + div1);
		System.out.println("백의 자리:" + div1);
		System.out.println("십의 자리:" + div1);
		System.out.println("일의 자리:" + div1);


	}
}
