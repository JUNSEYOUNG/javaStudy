//���� ���� ������ ����ϴ� ���α׷�

import java.util.Scanner;
class WhileCorrectValueInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month = -1;
		
		/*
		for(;;){
		System.out.print("���� �Է��ϼ���.==>"); //�� ������ ����� �� ��(1~12)�� �Է��� ������ �ݺ� �����ų�ž�!
		month = sc.nextInt();
		if(month >= 1 && month <=12){
			break;
			}
		}*/

		//���� �ݺ��� (���� �Է��ϼ���)�� while������ ǥ���غ���
		/* 1)
		while(true){                         //��� ���̶� �ݺ�
	    System.out.print("���� �Է��ϼ���.==>");
		month = sc.nextInt();
		if(month>=1 && month <=12){         //����� �� ���̸� while�� Ż��
			break;
			}
		}*/

		/* 2)
		while(month <1 || month >12){
			System.out.print("���� �Է��ϼ���.==>");
			month = sc.nextInt();
			}
		}*/

		//���� �ݺ��� (���� �Է��ϼ���)�� do while������ ǥ���غ���
		do{
			System.out.print("���� �Է��ϼ���.==>");
			month = sc.nextInt();
		}while(month <1 || month >12);

		String name = "";
		if(month >= 3 && month <=5){
			name = "��";
		}else if(month >= 6 && month <= 8){
			name = "����";
		}else if(month >= 9 && month <= 11){
			name = "����";
		}else{
			name = "�ܿ�";
		}
		System.out.printf("%d���� %s�Դϴ�.",month,name);
	}
}
