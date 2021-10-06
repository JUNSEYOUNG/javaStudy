//do while문 연습)사용자에게 n을 입력받아 1에서 n까지의 합을 누적하여
//출력하는 프로그램 작성

import java.util.Scanner;
class DoWhileExam2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, sum=0;                      //합을 누적하려고 sum선언하고 0초기값 줌
		System.out.print("n을 입력하세요.");
		n = sc.nextInt();

		int i=1;
		do{
			sum += i;
			i++;
		}while(i<=n);
		System.out.printf("1에서 %d까지의 합은 %d입니다.",n,sum);  //첫번째 %d는 n, %d는 sum
	}
}


/*
[do while문의 형식]

초기값;
do{
   반복 수행할 명령어들;
   증감식;
}while(조건식);
*/
