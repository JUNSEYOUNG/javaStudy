class Exponential1OfDouble 
{
	public static void main(String[] args) 
	{
		double data = 1.0E6;     //1.0 ���ϱ� 10�� 6���� �ǹ�(�Ҽ��� �տ� 0�� 6��) > 1000000.0
		double data2 = 1.0E-6;   //1.0 ���ϱ� 10�� -6���� �ǹ�(�Ҽ��� ���� 0�� 6��) > 1.0E-6
		System.out.println(data);  //1000000.0
		System.out.println(data2); //1.000000
	}
}
