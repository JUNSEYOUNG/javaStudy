//��Ʈ������ & | ^ �� ��Ʈ�� (&) ������ ���) �� ����� ���̸� �Է¹޾�
//�� ��� ��� 20�� �̻����� �Ǻ��Ͽ�
//������ �޼����� ����ϴ� ���α׷� �ۼ�
//(��Ʈ�����ڸ� �������� && || �� �̿�)

import java.util.Scanner;
class Exam07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int age1,age2;
		System.out.println("ù��° ����� ���̸� �Է��ϼ���.");
		age1 = sc.nextInt();
		System.out.println("�ι�° ����� ���̸� �Է��ϼ���.");
		age2 = sc.nextInt();


        System.out.println("**��°��**");
		System.out.println("age1:"+age1);
		System.out.println("age2:"+age2);
		
		if(age1 >= 20 & age2 >= 20)   //& && �Ѵٰ���
			System.out.println("�� ����� ���̴� ��� 20�� �̻��Դϴ�.");
		else
			System.out.println("�� ����� ���̴� ��� 20�� �̻��� �ƴմϴ�.");
	}
}
