//�񱳿����� ����) �л��� �̸�(String���ڿ�), ����, ����, ����(int����)�� �Է¹޾� 
//����(����)�� ���(double�Ǽ�)�� ���ϰ� ����� 60�� �̻��̸� ���Ͽ� ����Ѵ���
//����� 60�� �̻��̸� "�հ�", �׷��������� "���հ�"��
//����ϴ� ���α׷� �ۼ� (��, ����� �Ǽ������� ó��)

import java.util.Scanner;
class Exam02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		int kor, eng, math, sum;
		System.out.println("�̸��� �Է��ϼ���.");
		name = sc.next();
		System.out.println("���������� �Է��ϼ���.");
		kor = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		eng = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		math = sc.nextInt();

		sum = kor + eng + math;
		double avg;
		avg = (double)sum/(double)3;
		//avg = sum/3.0;

		System.out.println("**������**");
		System.out.println("�̸�:" + name);
		System.out.println("����:" + kor);
		System.out.println("����:" + eng);
		System.out.println("����:" + math);
		System.out.println("����:" + sum);
		System.out.println("���:" + avg);

		if(avg>=60)
		System.out.println("���:" + avg + " ������ �հ��Դϴ�.");
		else
		System.out.println("���հ��Դϴ�.");

	}
}
