//�迭����)5���� ���� ����ڿ��� �Է¹ޱ� (�迭 ����, ������ ��, ��ճ���)

import java.util.Scanner;
class StudentTest02 
{
	public static void main(String[] args) 
	{
		int[] age = new int[5];
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<age.length; i++){
			System.out.print((i+1) + "��° �л��� ���̸� �Է��ϼ���.");  //ù��° �л��������   //i�� 0�̴ϱ� ù��° �л� ���� ���Ϸ��� i+1�ؾߵ�
			age[i] = sc.nextInt(); 
		}
		
		int tot = 0;   //��ճ��̰��
		for(int i=0; i<age.length; i++){
            tot += age[i];       //�ݺ��� ���������� ���� ��ü������ �� ���ϱ�
		}
		double avg = (double) tot / age.length;
		System.out.println("��ճ���:" + avg);
	}
}