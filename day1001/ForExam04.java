/*for문 연습) 사용자에게 구구단 중에 몇단을 출력할지 입력하여 다음과 같이              //숫자를 받아서
해당 구구단을 출력하는 프로그램 for문을 이용해 작성                               //받은 숫자의 구구단을 출력
<<실행 예>>
구구단 중에 몇단을 출력할까요?
2라고 입력하면 >
2*1=2                //곱해진 수 123456789가 i임!
2*2=4
2*3=6
...
*/

import java.util.Scanner;
class ForExam04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("구구단 중에 몇단을 출력할까요?");             //단을 입력받음
		n = sc.nextInt();

		for(int i=1; i<=9; i++){                                 //*1 *2 *3...*9
			System.out.println(n + "*" + i + "=" + (n*i));
		}
	}
}
