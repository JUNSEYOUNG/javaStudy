class IntAndDoubleTest 
{
	public static void main(String[] args) 
	{
		//정수와 정수를 연산하면 결과가 정수가 된다. 2.0
		//만약 정수와 정수를 연산하여 실수값을 갖기를 원한다면
		//정수 중 하나를 실수로 자료형변환하여 연산해야 함! 2.5

		int a=5;
		int b=2;

		double result;
		//result = a/b;
		result = (double)a/b;
		System.out.println("나누기 결과:" + result);
	}
}

/*
C:\javaStudy\day0928>java IntAndDoubleTest
나누기 결과:2.0

C:\javaStudy\day0928>java IntAndDoubleTest
나누기 결과:2.5

*/