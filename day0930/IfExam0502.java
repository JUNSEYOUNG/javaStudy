//IfExam05�� ��������   
/*
������ ���� �Է������� "�߸��� �Է��Դϴ�."��� ����ϵ��� ���α׷� ����
���� �Է��ϼ��� > 100
100���� �Դϴ�.
*/

import java.util.Scanner;
class IfExam0502   
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name="";         //�����̸�
		int month;              //��
		System.out.println("���� �Է��ϼ���.");
		month = sc.nextInt();

		if(month < 1 || month > 12){                 //�ٶ������� �������� month�� 1���� �۰� month�� 12���� Ŀ����
			System.out.println("�߸��� �Է��Դϴ�.");
		}else{

		if(month>=3 && month<=5){
			name = "��";
		}else if(month>=6 && month<=8){        //�׷����ʰ� ���࿡
			name = "����";
		}else if(month>=9 && month<=11){
			name = "����";
		}else if(month==1 || month==2 || month==12){
			name = "�ܿ�";
		}
		System.out.println(month+ "����" +name+ "�Դϴ�.");
	}
}

}