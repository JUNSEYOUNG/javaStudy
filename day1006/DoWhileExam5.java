//연습) 반복문(for,while,do~while문)을 이용해 다음과 같이 동작하는 프로그램 작성
/*<실행 예>
n을 입력하세요==>5
*
**
***
****
*****
*/

import java.util.Scanner;
class DoWhileExam5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;   //줄수
		int i,j; //줄수,칸수를 위한 변수
		System.out.print("n을 입력하세요==>");
		n = sc.nextInt();

		/*
		//for문
		for(i=1; i<=n; i++){
			for(j=1; j<=i; j++){  //i가 1이면 j가 1까지
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		/*
		//while문
		i=1;
		while(i<=n){
			j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/

		//do while문
		i=1;   //i가 1이면 별을 한개출력하고 줄바꿈
		do{
			j=1;
			do{
				System.out.print("*");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=n);
		}
}

/*do while문 해석
n: 3
i: 1
j: 1
일단 실행하고 조건식은 나중에 검사함
*/
