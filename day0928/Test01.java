//����ڷκ��� ���ڿ��� �޾Ƽ� �� ù��°�� �ִ� ���� ����ϱ�(Char �ڷ���)

import java.util.Scanner;
class Test01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String data;
		System.out.println("���ڿ��� �Է��ϼ���.");
		data = sc.next();

		//char first;
		//first = data.charAt(0);
		//charAt�� String�� ��ġ(index)�� �ִ� ���� �ϳ��� �˷��ִ� ���
		char frist = data.charAt(0);
		System.out.println("�� ù��°�� �ִ� ���ڴ�" + first + "�Դϴ�.");
		//System.out.println("�� ù��°�� �ִ� ���ڴ�" + data.charAt(0) + "�Դϴ�.");

		//String first = data.charAt(0)+""; //String���� ����� ���ؼ� +"" ���̸� ��
		//System.out.println("�� ù��°�� �ִ� ���ڴ�" + first + "�Դϴ�.");
	}
}
