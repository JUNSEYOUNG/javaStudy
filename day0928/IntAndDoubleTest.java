class IntAndDoubleTest 
{
	public static void main(String[] args) 
	{
		//������ ������ �����ϸ� ����� ������ �ȴ�. 2.0
		//���� ������ ������ �����Ͽ� �Ǽ����� ���⸦ ���Ѵٸ�
		//���� �� �ϳ��� �Ǽ��� �ڷ�����ȯ�Ͽ� �����ؾ� ��! 2.5

		int a=5;
		int b=2;

		double result;
		//result = a/b;
		result = (double)a/b;
		System.out.println("������ ���:" + result);
	}
}

/*
C:\javaStudy\day0928>java IntAndDoubleTest
������ ���:2.0

C:\javaStudy\day0928>java IntAndDoubleTest
������ ���:2.5

*/