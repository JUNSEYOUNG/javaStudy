//switch case�� ����) ��������� 0~9 ������ ������ �Է¹޾Ƽ�   //��Ŭ���� ������ �ִµ�? ����� �̻���
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

		if(n<0 || n>9){                            //n�� ���� �޾Ƽ� �ٶ������� ������ �˻��غ�����(n�� 0���� �۰ų� 9���� ũ��)
			System.out.println("�Է� ������ �ʰ��߽��ϴ�.");
		}else{                                      //else�� �� �Ʒ� ��ü�� ���������� �غ�����
			
		String result = "";
		switch(n){
			case 0:result = "��";break;              //case���� ������ ���� ���ϴ� �ڵ�(��¹� �ڸ��� result�� ��)
			case 1:result = "��";break;              //�� Ŭ���� ����� �� �̻��ϳ�?
			case 2:result = "��";
			case 3:result = "��";
			case 4:result = "��";break;
			case 5:result = "��";break;
			case 6:result = "��";
			case 7:result = "ĥ";break;
			case 8:result = "��";
			case 9:result = "��";
		}
		System.out.println(result);
		}
	}
}