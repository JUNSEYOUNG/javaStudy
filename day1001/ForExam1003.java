/*만약 n의 값이 100이라고 가정해봅시다
21번의 반복문에서 i가 2일 때 22번의 조건식을 만족하여
flag에 false가 담김
이미 i가 2일 때 n은 소수가 아님이 판정됨
굳이 i를 증가시켜 3일때 판별하고 4일때 판별하여
쭈욱 99까지 일일이 물어볼 필요없음
그래서 flag에 false를 담는 순간 반복문을 탈출하도록 하는것이 좋겠음
*/

import java.util.Scanner;
class ForExam1003
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;      
		boolean flag = true;              //소수인지 구하는 변수선언 , true와 false이용해서!
		System.out.print("n을 입력하세요.==>");
		n = sc.nextInt();

		for(int i=2; i<n; i++){
			if(n%i==0){                    //i가 n의 약수니?(짝수면 소수가 아니다)  
			flag = false;
			break;                 //n이 100이라면 i가 2일때 탈출, n이 9라면 i가 3일때 탈출 
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
n을 입력하세요==>5
5은 소수입니다
*/

		
