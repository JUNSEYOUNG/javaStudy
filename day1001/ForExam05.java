/*for문 연습)사용자에게 1부터 어떤 수까지 더하기하여 누적할 것인지 입력받아                 //어떤 수 입력받기
1부터 입력한 수까지 합을 누적하여 출력하는 프로그램을                                  //사용자가 입력한 수까지
for문을 이용해 작성
<실행 예>
1부터 어떤 수까지 더하기 할까요? > 10(사용자가 입력)
1부터 10까지의 합은 __입니다.
*/

import java.util.Scanner;
class ForExam05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
	    int sum = 0;     //초기값 0주기     
		//i는 사용자로부터 입력받기 때문에 초기화하지 않아도 되지만 
		//sum은 반복문에서 연산을 하기 때문에 초기값 0주기
		//지금은 더하기를 할 거라 0으로 초기화했는데,
		//주어진 문제해결을 위해 때에 따라 적합한 초기값 주어야함
		System.out.println("1부터 어떤 수까지 더하기 할까요?");
		n = sc.nextInt();

		for(int i=1; i<=n; i++){
			sum += i;     //sum = sum+i;
		}
		System.out.println("1부터 "+n+ "까지의 합은 " + sum + "입니다.");
			//for문은 i값이 n(사용자가 입력한 값)보다 1커지면 끝남
	}
}
