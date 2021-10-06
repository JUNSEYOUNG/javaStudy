//pdf 선택문과 반복문 연습) exercise 6번의 2를 프로그래밍 (시그마문제-중첩반복문)
//수학식을 계산하는 코드작성

class Test1 
{
	public static void main(String[] args) 
	{
		int sum = 0;                   //누적한 합 구하기
		for(int i=10; i<=30; i++){     //i는 21번 돔
			for(int j=0; j<=5; j++){    //중첩반복문
				sum += i*j;
			}
		}
		System.out.println(sum);       //int를 for문 밖에서 선언했으니까 출력도 for문 밖에서!
	}
}
