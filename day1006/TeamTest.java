/*���� ��������) ����ڷ� ���� �̸�,����,������ �Է¹޾� ���ڸ��� �Ǻ��Ͽ� 
����ϴ� ���α׷��� �ۼ��մϴ�. ���� �Է°��� �߸��Ǹ� ����� �� ���� 
�Է¹��� ���� �ݺ� �����ϰ� �մϴ�.

<���� ��>
�̸��� �Է��ϼ���==>ȫ�浿
������ �Է��ϼ���==>-2
������ �Է��ϼ���==>100
������ �Է��ϼ���==>2
������ �Է��ϼ���==>30
������ �Է��ϼ���==>15
ȫ�浿 ���� ���ڸ��� __�ڸ��Դϴ�.
���Ͻðھ��?(y/n) ==> k
���Ͻðھ��?(y/n) ==> y
�̸��� �Է��ϼ���==> �̼���
������ �Է��ϼ���==>9
������ �Է��ϼ���==>20
�̼����� ���ڸ��� __�ڸ��Դϴ�.
���Ͻðھ��?(y/n)==>n
�����Ͽ����ϴ�.
*/

import java.util.Scanner;
class TeamTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name, data=" ";
		System.out.println("�̸��� �Է��ϼ���.");
		name = sc.next();

		int month, day;
		int n, y;

		do{
			System.out.print("������ �Է��ϼ���.==>");
			month = sc.nextInt();
		}while(month <1 || month >12);

		do{
			System.out.print("������ �Է��ϼ���.==>");
			day = sc.nextInt();
		}while(day<1 || day>31);


			
				switch(month){    //switch case:��°��()��, if��(������) ���  
					case 1: if(day<=19){System.out.println(name +"���� ���ڸ��� �����ڸ��Դϴ�.");}
					else {System.out.println(name+"���� ���ڸ��� �����ڸ��Դϴ�.");}
						break;
					case 2: if(day<=18){System.out.println(name+"���� ���ڸ��� �����ڸ��Դϴ�");}
					else {System.out.println(name+"���� ���ڸ��� ������ڸ��Դϴ�.");}
						break;
					case 3: if(day<=20){System.out.println(name+"���� ���ڸ��� ������ڸ��Դϴ�.");}
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
				while(true){
					System.out.print("�� �Ͻðھ��?(y/n)==>");
					data = sc.next();
					if(data != "y" && data == "n"){
						break;
				}
				System.out.println("�����Ͽ����ϴ�.");
				}
			}
	}
