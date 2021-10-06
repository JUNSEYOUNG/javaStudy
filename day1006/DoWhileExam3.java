//do while연습) 다음과 같이 동작하는 프로그램을 작성

/*<실행 예>
줄수를 입력하세요==>3
칸수를 입력하세요==>5
*****
*****
*****
*/

import java.util.Scanner;
class DoWhileExam3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("줄 수를 입력하세요.");
		a = sc.nextInt();
		System.out.println("칸 수를 입력하세요.");
		b = sc.nextInt();
		
		int i,j;       //i는 줄수, j는 칸수
		
		i=1;
		do{
			j=1;
			do{
				System.out.print("*");
				j++;

			}while(j<=b);  //칸수만큼 반복
			System.out.println();             //줄띄우려고
			i++;
		}while(i<=a); //줄수만큼 반복
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
