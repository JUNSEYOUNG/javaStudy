/*�ָ�����) ����ڿ��� �̸�,��,����,����,���ø� �Է¹޾�
�������ڸ� �Ǻ��Ͽ� ����ϴ� ���α׷� �ۼ��غ���
*/

import java.util.Scanner;
class MyFortune 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String name;
		System.out.println("�̸��� �Է��ϼ���.");
		name = sc.next();

	    String saju[] = {"��","��","��","��","��","��","��","��","��","��","��","��"};   //����
		String animal[] = {"��","��","��","�䳢","��","��","��","��","������","��","��","����"};  //����
		String time[] = {"�� 11��-1��", "���� 1��-3��", "���� 3��-5��", "����5-7��", "���� 7-9��", "���� 9-11��", "�� 11-1��", "���� 1-3��", "���� 3-5��", "���� 5-7��", "���� 7-9��", "���� 9-11��"};
		String des[] = {"õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��"};   //����

		String user[] = new String[4];
		
		int user_animal;  //��
		int user_bir;     //����
		int user_day;     //����
		int user_time;    //����

		System.out.println("����� �츦 �Է��ϼ���.");
		for(int i=0; i<12; i++){
			System.out.println("["+i+ "�� " +animal_12[i]+"]");
		}
		user_animal = sc.nextInt();

		System.out.println("����� ������ �Է��ϼ���.");
		user_bir = sc.nextInt();

		System.out.println("����� ������ �Է��ϼ���.");
		user_day = sc.nextInt();

		System.out.println("����� �¾ �ð��� �Է��ϼ���.");
		for(int i=0; i<12; i++){
			System.out.println("["+i+ "�� " +time_12[i]+"]");
		}
		user_time = sc.nextInt();

		int value[] = new int[4];

		value[0] = user_animal;
		value[1] = value[0] + user_bir -1;
		value[2] = value[1] + user_day -1;
		value[3] = value[2] + user_time;

		for(int i=0; i<4; i++){
			for(int n=0; n<12; n++){
				if(value[i]%12==n){
					user[i] = des_12[n];
				}
			}
		}
		System.out.println("����� �����Դϴ�.");
		for(int i=0; i<4; i++)
			System.out.println("["+user[i]+"]");
	}
}