//���ù� ����)����ڿ��� ���� �Է¹޾� �������� ����ϴ� ���α׷��� 
//switch case���� �̿��Ͽ� �ۼ�(���ǽ� ���� �� �����ϱ� if������ �߸��� �Է°� �ֵ��� ���ǽ� �ۼ���)

import java.util.Scanner;
class Exam01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = "";
		int month; 
		System.out.println("������ �Է��ϼ���.");
		month = sc.nextInt();

		//3,4,5 �� //6,7,8 ���� //9,10,11 ���� //12,1,2 �ܿ�
		//���� �߸��Ǹ� ó���ϰ� �׷��� ������ switch�� �������� �ڵ�!

		if(month<1 || month>12){
			System.out.println("�Է°��� �߸��Ǿ����ϴ�.");
			
		}else{
			switch(month) {
				case 3: case 4: case 5: name = "��"; break; 
				case 6: case 7: case 8: name = "����"; break;
				case 9: case 10: case 11: name = "����"; break;
				case 12: case 1: case 2: name = "�ܿ�"; break;
			}
		    System.out.println(month + "����" + name + "�Դϴ�.");
		}

		
		
	}
}