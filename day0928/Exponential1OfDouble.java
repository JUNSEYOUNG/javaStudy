class Exponential1OfDouble 
{
	public static void main(String[] args) 
	{
		double data = 1.0E6;     //1.0 곱하기 10의 6승을 의미(소수점 앞에 0이 6개) > 1000000.0
		double data2 = 1.0E-6;   //1.0 곱하기 10의 -6승을 의미(소수점 이하 0이 6개) > 1.0E-6
		System.out.println(data);  //1000000.0
		System.out.println(data2); //1.000000
	}
}
