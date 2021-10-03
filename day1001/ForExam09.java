/*반복문 for 안에서 선택문 if문이 사용되는 것 연습)                    //if문 안에는 조건식이 들어감
ex) 4의 약수는?
1,2,4 이요!

연습)사용자한테 어떤 n을 입력받아 n의 약수를 모두 출력하는 프로그램 작성
*/

import java.util.Scanner;
class ForExam09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("n을 입력하세요.==>");
		n = sc.nextInt();

		System.out.print(n+"의 약수는 ");

		//어떤 수 i가 1부터 증가해서 1,2,3,4,...n이 될 때까지
		for(int i=1; i<=n; i++){
			if(n%i==0){   //n을 i로 나눈 나머지 값이 0이 되니? == i가 n의 약수니?
			System.out.print(i + " ");             //+ " "을 하니까 한칸 띄어쓰기가 되네
			}
		}
		System.out.println("입니다.");
	}
}
