//while문 연습) 사용자에게 n을 입력받아 n!을 구하여 출력하는 프로그램 작성
/*<실행 예>
n을 입력하세요 ==> 5
5*4*3*2*1=120           //내림차순정렬
*/

import java.util.Scanner;
class WhileExam3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, sum=1;
		System.out.println("n을 입력하세요.==>");
		n = sc.nextInt();

		int i=n;
		while(i>=1){
			System.out.print(i);
			if(i != 1){
				System.out.print("*");
			}
			sum*=i;
			i--;
		} 
		System.out.println("=" + sum);
	}
}
