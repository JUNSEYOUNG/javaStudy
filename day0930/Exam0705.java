//switch case�� ����) ��������� 0~9 ������ ������ �Է¹޾Ƽ�
//�ѱ�ǥ��� ����ϴ� ���α׷� �ۼ�
//<<���� ��>>
//0~9������ ���� �Է��Ͻÿ� ==> 7�Է��ϸ� ĥ ���

import java.util.Scanner;
class Exam0705
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9������ ���� �Է��ϼ���.");
		n = sc.nextInt();
		int(n<0 || n>9){                            //n�� ���� �޾Ƽ� �ٶ������� ������ �˻��غ�����
			System.out.println("�Է� ������ �ʰ��߽��ϴ�.");
		}else{                                      //else�� �� �Ʒ� ��ü�� ���������� �غ�����
			
		String result = "";
		switch(n){
			case 0:result = "��";break;              //case���� ������ ���� ���ϴ� �ڵ�
			case 1:result = "��";break;
			case 2:result = "��";break;
			case 3:result = "��";break;
			case 4:result = "��";break;
			case 5:result = "��";break;
			case 6:result = "��";break;
			case 7:result = "ĥ";break;
			case 8:result = "��";break;
			case 9:result = "��";break;
		}
		System.out.println(result);
		}
	}
}