/*for문 연습)사용자에게 n을 입력받아 n!을 구하여 다음과 같이 출력하는 프로그램을
for문을 이용해 작성
<실행 예>
n을 입력하세요 > 5
5*4*3*2*1=___
*/

/*초기값이 조건식의 최종값보다 꼭 작을 필요는 없음!
큰값부터 반대로 감소하면서 반복문을 실행시킬 수도 있음!
*/

import java.util.Scanner;
class ForExam06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n , sum=1;                        //곱하기해서 누적해야 하니까 초기값 1주기(더하기일 때는 0주기)
		System.out.print("n을 입력하세요==>");
		n = sc.nextInt();

		//i: 5,4,3,2,1  곱하기라 실행 예를 보면 거꾸로 이렇게 진행되도록 해야함!
		for(int i=n; i>=1; i--){   //i--는 i=i-1임   //사용자가 n에 뭘 넣던 n부터!
		sum = sum*i;
		System.out.print(i);
		if(i != 1){                //i가 1이 아니라면     //1뒤에 *안오게 하려고 작성
			System.out.print("*");
		}
	}
        System.out.println("=" + sum);  //i가 0이 되면 for문 탈출함
	}
}
