class CharAndStringTest 
{
	public static void main(String[] args) 
	{
		//�ڹٿ����� ���Ϲ����� ó���� ���ڿ��� ó���� �ٸ�
		//�ϳ��� ���ڸ� ǥ���ϱ� ���ؼ��� Ȫ����ǥ�� ����� �ϰ�,
		//���ڿ��� ó���ϱ� ���ؼ��� �ֵ���ǥ�� ����� ��
		//���� �ϳ��� ���������� �ֵ���ǥ�� �����ٸ� char�� ������ �� ����,
		//String���� �����ؾ� ��

		char firstName;
		firstName = '��';
		System.out.println(firstName);

		String name;
		name = "�ڼ���";
		System.out.println(name);

		//char lastName; //�ϳ��� ���ڴ� Ȫ����ǥ�� ó���ؾ� �ϴµ�, �ֵ���ǥ�� ������
		String lastName;
		lastName = "��"; 
		System.out.println(lastName);

		String data;
		data = "hello";
		char last = data.charAt(4);
		//charAt�� String�� ��ġ(index)�� �ִ� ���� �ϳ��� �˷��ִ� ���
		System.out.println("�� �������� �ִ� ���ڴ�" + last + "�Դϴ�.");

	}
}
/*
C:\javaStudy\day0928>javac CharAndStringTest.java
CharAndStringTest.java:20: error: incompatible types: String cannot be converted to char
                lastName = "��";
                           ^
1 error

*/