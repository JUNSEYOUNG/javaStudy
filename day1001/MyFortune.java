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

		int ddi_12;
		ddi_12 = sc.nextInt();

        String MyFortune_12[] = {"��","��","��","��","��","��","��","��","��","��","��","��"};  
		int ddi_12[] = {"��","��","��","�䳢","��","��","��","��","������","��","��","����"};
		int bir_12[] = {"�� 11��-1��", "���� 1��-3��", "���� 3��-5��", "����5-7��", "���� 7-9��", "���� 9-11��", "�� 11-1��", "���� 1-3��", "���� 3-5��", "���� 5-7��", "���� 7-9��", "���� 9-11��"};
		int solu_12[] = {"õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��", "õ��"};

		String user[] = new String[4];

		int user_ddi;   //��
		int user_mon;   //����
		int user_day;   //����
		int user_bir;   //����

		int val[] = new int[4];

		System.out.println("����� �츦 �������ּ���.");
		for(int i=0; i<12; i++){
			System.out.println("["+i+"��" + ddi_12[i]+"]");
		}
		user_ddi = sc.nextInt();

		System.out.println("����� �¾ ���� �Է��ϼ���.");
		user_mon = sc.nextInt();

		System.out.println("����� �¾ ���� �Է��ϼ���.");
		user_day = sc.nextInt();

		System.out.println("����� �¾ �ð��� �Է��ϼ���.");
		for(int i=0; i<12; i++){
			System.out.println("["+i+"��" + bir_12[i]+"]");
		}
		user_bir = sc.nextInt();

		value[0] = user_ddi;
		value[1] = value[0] + user_mon -1;
		value[2] = value[1] + user_day -1;
		value[3] = value[2] + user_bir;

		for(int i=0; i<4; i++){
			for(int j=0; j<12; j++){
				if(value[i]%12==j){
					user[i] = solu_12[j];
				}
			}
		}

		System.out.println("����� �����Դϴ�.");
		for(int i=0; i<4; i++)
			System.out.println("["+user[i]+"]");

	}
}