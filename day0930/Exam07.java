//switch case�� ����) ��������� 0~9 ������ ������ �Է¹޾Ƽ�
//�ѱ�ǥ��� ����ϴ� ���α׷� �ۼ�
//<<���� ��>>
//0~9������ ���� �Է��Ͻÿ� ==> 7�Է��ϸ� ĥ ���

import java.util.Scanner;
class Exam07
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9������ ���� �Է��ϼ���.");
		n = sc.nextInt();
		switch(n){
			case 0:System.out.println("��");break;           
			case 1:System.out.println("��");break;
			case 2:System.out.println("��");break;
			case 3:System.out.println("��");break;
			case 4:System.out.println("��");break;
			case 5:System.out.println("��");break;
			case 6:System.out.println("��");break;
			case 7:System.out.println("ĥ");break;
			case 8:System.out.println("��");break;
			case 9:System.out.println("��");break;
			default:System.out.println("�Է¹����� �ʰ��߽��ϴ�.");

		}
	}
}