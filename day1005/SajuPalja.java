//�������� ���α׷�(�ϼ�) �̸�,����,����,����,�ð� �ޱ�

import java.util.Scanner;
class SajuPalja
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] result = {"õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��","õ��",
			"õ��","õ��","õ��"};

		String name;
		int year;
		int month;
		int date;
		int time;

		System.out.print("�̸��� �Է��ϼ���.==>");
		name = sc.next();
		System.out.println("�츦 �Է��ϼ���.==>");
		System.out.print("0:��,1:��,2:��,3:�䳢,4:��,5:��,6:��,7:��,8:������,9:��,10:��,11:���� ==>");
		year = sc.nextInt();    //1(�Ҷ�� 1�Է�) /õ��
		System.out.print("������ �Է��ϼ���==>");
		month = sc.nextInt();  //3���̶�� ���� /õ��
		System.out.print("������ �Է��ϼ���.==>");
		date = sc.nextInt();   //20���̶�� ���� /õ��
		System.out.println("���ø� �Է��ϼ���.");
		System.out.print("0:��,1:��,2:��,3:��,4:��,5:��,6:��,7:��,8:��,9:��,10:��,11:��==>");
		time = sc.nextInt();   //8(�Žö� 8�Է�) /õ��

		int n = year;   //n�� 1
		System.out.println("***"+name+"���� �������� Ǯ��***");
		System.out.println("������ �����" + result[n]);        //õ��
		n = (n + month -1)%12;                              //1+3=4 -1=3%12 =3
		System.out.println("������ �����" + result[n]);        //õ��
		n = (n + date -1)%12;                               //3+20=23 -1=22%12 =10
		System.out.println("������ �����" + result[n]);        //õ��
		n = (n + time)%12;                                  //10+8=18 %12=6  
		System.out.println("������ �����" + result[n]);        //result�� 6��°: õ��
	}
}