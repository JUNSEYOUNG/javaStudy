//연습)제어문>선택문>if문 
//사용자한테 임의의 수 n을 입력받아 n이 양수이면 그 수에 100을 더한 값을
//출력한 다음 "작업종료"를 출력하고 그렇지 않으면 그 수의 제곱을 출력한 다음
//"작업종료"를 출력하도록 프로그램 작성


import java.util.Scanner;
class IfExam01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("임의의 수 n을 입력하세요.");
		n = sc.nextInt();

		if(n>=0){           //n이 양수냐?
			System.out.println(n + 100);
		}else{
            System.out.println(n*n);
		}
         System.out.println("작업종료");
	}
}
