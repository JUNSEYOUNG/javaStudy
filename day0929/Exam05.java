//�������� && || ����) �л��� �̸�, ����, ����, ������ �Է¹޾�
//���������� 90�� �̻��̰� ��������� 90�� �̻��̸�                ">~�̰�ϱ� ����&&����϶�°ų�?" 
//���б��� �����Ϸ��� ��
//���б� ���޿��θ� �Ǻ��ϴ� ���α׷� �ۼ�

import java.util.Scanner;
class Exam05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("�л��� �̸��� �Է��ϼ���.");
		name = sc.next();
		int kor, eng, math, sum;     //���(avg)�� ����Ÿ������ �������� ���⿡ avg�ֱ�
		System.out.println("���������� �Է��ϼ���.");
		kor = sc.nextInt();
        System.out.println("���������� �Է��ϼ���.");
		eng = sc.nextInt();
		System.out.println("���������� �Է��ϼ���.");
		math = sc.nextInt();

		sum = kor + eng + math;
		double avg;                //���(avg)�� �Ǽ��� �������� ���⿡ double�� ������
		avg = (double)sum / 3;     //�Ǽ��� ��� ���� ĳ���ÿ�����()���
		//avg = sum / 3.0;

		System.out.println("**��°��**");
		System.out.println("�̸�:" + name);
		System.out.println("����:" + kor);
		System.out.println("����:" + eng);
		System.out.println("����:" + math);
		System.out.println("����:" + sum);
		System.out.println("���:" + avg);


		if(kor >= 90 && avg >=90)
			System.out.println("���б� ���޴�����Դϴ�.");
		else
			System.out.println("���б� ���޴���ڰ� �ƴմϴ�.");
	}
}
