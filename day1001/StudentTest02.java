//배열문제)5명의 내용 사용자에게 입력받기

import java.util.Scanner;
class StudentTest02 
{
	public static void main(String[] args) 
	{
		int []age = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<age.length; i++){
			System.out.prit((i+1) + "번째 학생의 나이를 입력하세요.");  //첫번째 학생나이출력
			age[i] =sc.nextInt(); 
		}
		
		int tot = 0;   //평균나이계산
		for(int i=0; i<age.length; i++){
            tot += age[i];       //반복문 빠져나가기 전에 전체나이의 합 구하기
		}
		double avg = (double) tot / age.length;
		System.out.println("평균나이:" + avg);
	}
}