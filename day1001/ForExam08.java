/*for문 연습) 사용자에게 어떤 수 n을 입력받아 1에서 n까지의 짝수의 합, 홀수의 합,  
짝수의 갯수, 홀수의 갯수를 각각 구하여 출력하는 프로그램 작성 
*/

import java.util.Scanner;
class ForExam08
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n, even_sum=0, odd_sum=0, even_cnt=0, odd_cnt=0;    //짝수 합, 홀수 합, 짝수 갯수, 홀수갯수 받기위한 변수선언
		System.out.print("n을 입력하세요.==>");
		n = sc.nextInt();

		//사용자가 어떤 수 n을 입력할지는 모르겠지만 
		//i: 1,2,3,4,5,6...n 
		//i가 1이면 짝수야 홀수야? 물어보기

		for(int i=1; i<=n; i++){
			if(i%2==0){
				even_sum += i;//even_sum = even_sum + i;  //짝수를 누적해야 하니까 짝수인 i를 더하는 것
				even_cnt++; //even_cnt = even_cnt + 1;  //개수 누적해야 하니까 1개씩 더하기
			}else{
				odd_sum += i;
				odd_cnt++;
			}
		}
		System.out.println("1에서 " +n+ "까지의 짝수의 합"+ even_sum);
		System.out.println("1에서 " +n+ "까지의 짝수의 개수"+ even_cnt);
		System.out.println("1에서 " +n+ "까지의 홀수의 합"+ odd_sum);
		System.out.println("1에서 " +n+ "까지의 홀수의 개수"+ odd_cnt);
	}
}