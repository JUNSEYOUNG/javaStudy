//if�� ����)����ڿ��� �̸��� ��������� �Է¹޾� ����ϰ��� ��������� �Ǻ��Ͽ� 
//����� ����ϴ� ���α׷��� �ۼ�

//<ó������>
//����ϰ��� ����ڴ� ���̰� 40�� �̻��̰�, �� �ذ� ¦��������� ¦�������� �¾ ���
//�� �ذ� Ȧ��������� Ȧ�������� �¾ ���
//40�� �̻��̸� �ϰ��� �׸��� ����,����
//50�� �̻��̸� �ϰ��� �׸��� ����,����,�����

import java.util.Scanner;
import java.util.Date;    //���ؿ��� �� �� �ִ� ����
class IfExam04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name;
		String items = "";
        int userYear,age,thisYear;       //�������,����,���ؿ���
		thisYear = today.getYear()+1900;     //���ؿ��� ���ϴ� ����

		System.out.println("������� �̸��� �Է��ϼ���.");
		name = sc.next();
		System.out.println("������� ��������� �Է��ϼ���.");
		userYear = sc.nextInt();

		age = thisYear - userYear; //��������� ���� ���̸� ���
		System.out.println(name+"��, ���ؿ�" + age + "���Դϴ�.");

		if(age>=40 && thisYear%2 == userYear%2){     //����ϰ��� ��������� �Ǻ�
			items = "����,����";
			if(age>=50){
				items = items + ",�����";
			}
			System.out.println(name+"��,"+ thisYear+"�⵵�� ����ϰ��� ������Դϴ�.");
			System.out.println("�ϰ��� �׸���" +items+"�Դϴ�.");

		}else{
		System.out.println(name+"��, " + thisYear+"�⵵�� ����ϰ��� ����ڰ� �ƴմϴ�.");
		}
	}
}
