//����) ����ڿ��� ���ڿ��� �Է¹޾� ���ڿ��� ���̰�
//4���� �̻����� true, flase�� ����ϵ��� �غ���

import java.util.Scanner;
class Test03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("���ڿ��� �Է��ϼ���.");
		str = sc.next();

		boolean result;
		result = str.length() >= 4;
			System.out.println(result);
	}
}
