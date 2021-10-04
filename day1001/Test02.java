/* 선택문과 반복문) 간단한 계산기 프로그램 작성
사용자로부터 하나의 문자를 입력받고 이어 2개의 숫자를 입력받는다
받은 문자가 '+'이면 두 수의 덧셈을, '-'이면 뺄셈을,
'x'이면 곱셈을, '/'이면 나눗셈을 수행하도록 작성
if-else문 사용하고 나눗셈의 경우 분모가 0이 아닌지를 먼저 검사하여야 한다
*/

import java.util.Scanner;
class Test02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String n = "";
		System.out.println("하나의 문자를 입력하세요.(+,-,x,/)");
		n = sc.next();
		int a = 0;
		int b = 0;
		System.out.println("첫번째 숫자를 입력하세요.");
		a = sc.nextInt();
		System.out.println("두번째 숫자를 입력하세요.");
		b = sc.nextInt();

		if(n.equals ("+")){         
			System.out.println("덧셈 결과: " + (a+b));
		}else if(n.equals ("-")){
			System.out.println("뺄셈 결과: " + (a-b));
		}else if(n.equals ("x")){
			System.out.println("곱셈 결과: " + (a*b));
		}else if(n.equals ("/")){
			if(b==0){
				System.out.println("분모가 0입니다.");
			}else{
			System.out.println("나눗셈 결과: " + (a/b));	
		}
		}
	}	
}
