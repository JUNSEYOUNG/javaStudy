/*����ڿ��� ���ڿ��� �Է¹޾Ƽ� �Է��� ���ڿ��� ������ ���� ���Ͽ�
����ϴ� ���α׷� �ۼ�*/

import java.util.Scanner;
class Exam1
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;  
		int cnt=0; //������ ���� �˷��� ��������
		char c;  //�� ���ھ� �������� ��������
		System.out.print("���ڿ��� �Է��ϼ���.==>");
		data = sc.next();

		for(int i=0; i<data.length(); i++){      //�Է¹��� ���ڿ��� ���̸�ŭ �ݺ�
			c = data.charAt(i);
			if(c == 'a' || c == 'A' || c == 'e' || c == 'E' || c == 'i' || c == 'I' || c == 'o' ||
			   c == 'O' || c == 'u' || c == 'U'){              //�Է¹��� ���ڿ��� �� ���ھ� �������� ���������!
				cnt++;
			   }//end if	
		}//end for
			System.out.println("������ ���� " + cnt + "���Դϴ�.");
			System.out.printf("������ ���� %d���Դϴ�.",cnt);
	}
}
