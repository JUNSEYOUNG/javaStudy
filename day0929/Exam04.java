//�񱳿����� ����)�λ���� ���̸� �Է¹޾� ���� ������ �Ǻ��Ͽ�
//������ �޽����� ����ϴ� ���α׷� �ۼ�
//(Ŭ�����̸�, ������, ��¸޽����� �����Ӱ� ��)

import java.util.Scanner;
class Exam04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2;
		System.out.println("ù��° ����� ���̸� �Է��ϼ���.");
		age1 = sc.nextInt();
		System.out.println("�ι�° ����� ���̸� �Է��ϼ���.");
	    age2 = sc.nextInt();

		if(age1 == age2)
	    System.out.println("�� ����� ģ���Դϴ�.");
		else
	    System.out.println("�� ����� ģ���� �ƴմϴ�.");
	}
}
