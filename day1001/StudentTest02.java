//�迭����)5���� ���� ����ڿ��� �Է¹ޱ�

import java.util.Scanner;
class StudentTest02 
{
	public static void main(String[] args) 
	{
		int []age = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<age.length; i++){
			System.out.prit((i+1) + "��° �л��� ���̸� �Է��ϼ���.");  //ù��° �л��������
			age[i] =sc.nextInt(); 
		}
		
		int tot = 0;   //��ճ��̰��
		for(int i=0; i<age.length; i++){
            tot += age[i];       //�ݺ��� ���������� ���� ��ü������ �� ���ϱ�
		}
		double avg = (double) tot / age.length;
		System.out.println("��ճ���:" + avg);
	}
}