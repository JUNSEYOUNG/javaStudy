/*��������) switch�� �ȿ� if�� �־����!
����ڿ��� ������ ������ �Է¹޾�
���ڸ��� �Ǻ��Ͽ� ����ϴ� ���α׷� �ۼ�

�̸� > ������
���� > 2
���� > 9
�����δ��� ���ڸ��� �����ڸ��Դϴ�
*/

import java.util.Scanner;
class TeamExam01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("�̸��� �Է��ϼ���.");
		name = sc.next();
		int month, day;
		System.out.println("������ �Է��ϼ���.");
		month = sc.nextInt();
		System.out.println("������ �Է��ϼ���.");
		day = sc.nextInt();
		if(month<1 || month>12 || day<1 || day>31){
			System.out.println("�߸��� �Է°��Դϴ�.");}
			else{
		switch(month){
			case 1: if(day<=19) {System.out.println("�����ڸ��Դϴ�.");break;
			case 2:System.out.println("2");break;
			case 3:System.out.println("3");break;
			case 4:System.out.println("4");break;
			case 5:System.out.println("5");break;
			case 6:System.out.println("6");break;
			case 7:System.out.println("7");break;
			case 8:System.out.println("8");break;
			case 9:System.out.println("9");break;
			case 10:System.out.println("10");break;
			case 11:System.out.println("11");break;
			case 12:System.out.println("12");break;
		}

            switch(day){
			case 1:System.out.println("1");break;
			case 2:System.out.println("2");break;
			case 3:System.out.println("3");break;
			case 4:System.out.println("4");break;
			case 5:System.out.println("5");break;
			case 6:System.out.println("6");break;
			case 7:System.out.println("7");break;
			case 8:System.out.println("8");break;
			case 9:System.out.println("9");break;
			}
			System.out.println(name+"���� ���ڸ���" + "�����ڸ� �Դϴ�.");
	}
}



<<����>>
	���ڸ� ���α׷� �����غ���
	���� �н����� �������
    pdf�� ���ù��� �ݺ��� > 1���� �������� ǥ���غ���
	���α׷��� 6�� �ۼ��غ���


