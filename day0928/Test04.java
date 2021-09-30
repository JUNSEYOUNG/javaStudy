//연습) 사용자에게 두개의 정수를 입력받아 사칙연산을 수행한 결과를
//다음과 같이 출력하는 프로그램 작성

//첫번째 수를 입력하시오 ==> 5
//두번째 수를 입력하시오 ==> 2
//5+2=__
//5-2=__
//5*2=__
//5/2=__

import java.util.Scanner;
class Test04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		int a,b,add,sub,multi,div,mode;
		System.out.print("첫번째 수를 입력하세요.");
		a = sc.nextInt();
		System.out.print("두번째 수를 입력하세요.");
		b = sc.nextInt();

		add = a+b;
		sub = a-b;
		multi = a*b;
		div = a/b;
		mode = a%b;

		System.out.println("오칙연산결과");
		System.out.println(a+"+"+b+"="+add);
		System.out.println(a+"-"+b+"="+sub);
		System.out.println(a+"*"+b+"="+multi);
		System.out.println(a+"/"+b+"="+div);
		System.out.println(a+"%"+b+"="+mode);
	}
}
