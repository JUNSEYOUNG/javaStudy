//if�� ����) ����ڿ��� ���� �Է¹޾� �������� ����ϴ� ���α׷� �ۼ�
//<ó������> 
//3,4,5 ��
//6,7,8 ����
//9,10,11 ����
//12,1,2 �ܿ�

import java.util.Scanner;
class IfExam05   
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name="";         //�����̸�
		int month;              //��
		System.out.println("���� �Է��ϼ���.");
		month = sc.nextInt();

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