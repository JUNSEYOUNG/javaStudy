/*����ڿ��� ���ڿ��� �Է¹޾Ƽ� �Է��� ���ڿ��� ������ ���� ���Ͽ�
����ϴ� ���α׷� �ۼ�*/

import java.util.Scanner;
class Exam2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;  
		int cnt=0; //������ ���� �˷��� ��������
		char c;  //�� ���ھ� �������� ��������
		System.out.print("���ڿ��� �Է��ϼ���.==>");
		data = sc.next();

		for(int i=0; i<data.length(); i++){ 
			c = data.charAt(i);
			switch(c){
				case'a':case'A':case'e':case'E':case'i':case'I':case'o':case'O':case'u':case'U':
					cnt++;
			}
		}//end for
			System.out.println("������ ���� " + cnt + "���Դϴ�.");
			System.out.printf("������ ���� %d���Դϴ�.",cnt);
	}
}
