/*반복문 for 안에서 선택문 if문이 사용되는 것 연습 중) 
ex)3은 소수인가요?
ㅇㅇ맞음
약수의 개수가 2개인 수
소수란 1과 자기자신으로만 나누어지는 수

연습)사용자에게 어떤 수 n을 입력받아 소수인지 아닌지 판별하는 프로그램 작성
*/

import java.util.Scanner;
class ForExam1002
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;      
		boolean flag = true;              //소수인지 구하는 변수선언 , true와 false이용해서!
		System.out.print("n을 입력하세요.==>");
		n = sc.nextInt();

		for(int i=2; i<n; i++){
			if(n%i==0){                    //i가 n의 약수니?  
			flag = false;
		}
	}

	//if(flag==true){                           // if(flag)냐 라고 묻는거랑 같음!
	if(flag){
		System.out.println(n+"은 소수입니다.");
	}else{
		System.out.println(n+"은 소수가 아닙니다.");
	}
}
}

/*출력결과:
n을 입력하세요.==>10
10은 소수가 아닙니다.

n을 입력하세요.==>5
5은 소수입니다.
*/

		
