//pdf 선택문과 반복문 연습) programming 9번

/*다음과 같이 정의되는 함수의 함수값을 계산하여 보자. 
사용자로부터 x값을 입력받아서 함수값을 계산하여 화면에 출력한다. x는 실수이다.(double)
f(x) = x^3 - 9x + 2   ( x <= 0 )
f(x) = 7x + 2    ( x > 0 )

두 문장 중에 하나 선택하도록 해야함
*/

import java.util.Scanner;
class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x,result;
		System.out.print("x를 입력하세요.==>");
		x = sc.nextDouble();

		if(x <= 0){
			result = (x*x*x) - (9*x) + 2;     //곱셈은 ()로 표시
		}else{
			result = (7*x) + 2;
		}
		System.out.println("결과: " + result); //참이든 거짓이든 결과출력해야되니까 if문 밖으로 뺌
	}
}
