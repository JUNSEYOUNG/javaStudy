//���׿����� (��1)?��2:��3 ����) ����ڿ��� �ΰ��� ������ �Է¹޾� ���߿� �������� ã�� ����ϴ� ���α׷���
//���׿����ڸ� �̿��� �ۼ�

import java.util.Scanner;
class Exam09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;                                  //int a, b, min;
		System.out.println("ù��° ���� �Է��ϼ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���.");
		b = sc.nextInt();

        System.out.println("**���� �� ��°��**");   //min = (a<b)?a:b;
		System.out.println((a<b)?a:b);           //("���� ����"+min+"�Դϴ�."); //������ �־ ����ϴ� ���
	}
}
