/*��������3) ����ڿ��� ������ ������ �Է¹޾� ���ڸ��� �Ǻ��Ͽ� ����ϴ� ���α׷� �ۼ�,����

�̸� ==> ooo
���� ==> o
���� ==> o
ooo���� ���ڸ��� oo�ڸ��Դϴ�
*/

import java.util.Scanner;
class Test03 
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
					case 1: if(day<=19){System.out.println(name +"���� ���ڸ��� �����ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� �����ڸ��Դϴ�.");}
						break;
					case 2: if(day<=18){System.out.println(name+"���� ���ڸ��� �����ڸ��Դϴ�");}
					else {System.out.println(name+"���� ���ڸ��� �������ڸ��Դϴ�.");}
						break;
					case 3: if(day<=20){System.out.println(name+"���� ���ڸ��� �������ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� ���ڸ��Դϴ�.");}
						break;
					case 4: if(day<=19){System.out.println(name+"���� ���ڸ��� ���ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� Ȳ���ڸ��Դϴ�.");}
						break;
					case 5: if(day<=20){System.out.println(name+"���� ���ڸ��� Ȳ���ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� �ֵ����ڸ��Դϴ�.");}
						break;
					case 6: if(day<=21){System.out.println(name+"���� ���ڸ��� �ֵ����ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� ���ڸ��Դϴ�.");}
						break;
					case 7: if(day<=22){System.out.println(name+"���� ���ڸ��� ���ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� �����ڸ��Դϴ�.");}
						break;
					case 8: if(day<=22){System.out.println(name+"���� ���ڸ��� �����ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� ó���ڸ��Դϴ�.");}
						break;
					case 9: if(day<=23){System.out.println(name+"���� ���ڸ��� ó���ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� õĪ�ڸ��Դϴ�.");}
						break;
					case 10: if(day<=22){System.out.println(name+"���� ���ڸ��� õĪ�ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� �����ڸ��Դϴ�.");}
						break;
					case 11: if(day<=22){System.out.println(name+"���� ���ڸ��� �����ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� ����ڸ��Դϴ�.");}
						break;
					case 12: if(day<=24){System.out.println(name+"���� ���ڸ��� ����ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� �����ڸ��Դϴ�.");}
						break;
		
				}
			}
	}
	}
