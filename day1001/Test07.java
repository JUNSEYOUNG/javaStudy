/*선택문과 반복문) 특정한 정수를 읽어들여서 0과 이 정수 사이에 있는 
모든 3의 배수를 출력하는 프로그램 작성
만약 입력 정수값이 0보다 작으면 오류 메시지를 출력하라
*/

import java.util.Scanner;
class Test07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.print("정수를 입력하세요.==>");
		n = sc.nextInt();

		if(n<0){
			System.out.println("오류입니다.");
		}else{
			System.out.println("0과 " +n+ "사이에 있는 3의 배수:");
		for(i=0; i<=n; i++){
			if(i%3==0) 
				System.out.print(i+ " ");
			}
		}
	}
}
