//switch case�� ����) ��������� 0~9 ������ ������ �Է¹޾Ƽ�
//�ѱ�ǥ��� ����ϴ� ���α׷� �ۼ�
//<<���� ��>>
//0~9������ ���� �Է��Ͻÿ� ==> 7�Է��ϸ� ĥ ���

import java.util.Scanner;
class Exam0703
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9������ ���� �Է��ϼ���.");
		n = sc.nextInt();                             
		switch(n){                                     //n�� 2�Է½� ������: ��
			case 0:
			case 1:
			case 2:
			case 3:System.out.println("��");break;
			case 4:
			case 5:
			case 6:
			case 7:System.out.println("ĥ");break;
			case 8:
			case 9:
			default:System.out.println("�Է¹����� �ʰ��߽��ϴ�.");

		}
		System.out.println("����");
	}
}