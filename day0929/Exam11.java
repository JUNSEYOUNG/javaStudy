//복합치환연산자 +=  -=  *=  /+  %=  >>=   <<=  연습)
//다음과 같이 동작하는 프로그램 작성해보기
//<실행 예> 1부터 어떤 수까지 더할까요?      입력받아서        //1부터 어떤 수까지면 i=i; 이거 써야되서 for문 쓰겠구나!
//        1부터 7까지의 합은 ____입니다.   출력

import java.util.Scanner;
class Exam11
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0,i;
		System.out.println("1부터 어떤 수까지 더할까요?");
		n = sc.nextInt();

		for(i=1; i<=n; i++){
			sum += i;    //sum=sum+i
		}

        System.out.println("**출력결과**");
		System.out.println("1부터" +n+ "까지의 합은" + sum + "입니다."); 
	}
}
