// 선택문과 반복문) 다음의 수학식을 계산하는 코드를 작성하라

class Test01 
{
	public static void main(String[] args) 
	{
		int sum = 0;
		for(int i=1; i<=30; i++)
			sum = sum + i*i+1;
		System.out.println("결과:" + sum);
	}
}
