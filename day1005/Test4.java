/*pdf ���ù��� �ݺ��� ����) lab�� 1��
������ �Է¹޾Ƽ� 60�� �̻��̸� �հ�, 60�� �̸��̸� ���հ��̶�� ����ϴ� ���α׷�
*/

import java.util.Scanner;
class Test4 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int score;
		System.out.print("������ �Է��ϼ���.==>");   //format �����ǳ����� ���������ؼ� ����ϰ� ���� �� ���(%s,%f,%d)
		score = input.nextInt();
		//System.out.println((score>=60)?"�հ�":"���հ�");  //���ǿ�����(����) ���

		/*if(score>=60){                       //��ɾ 2���̻��̸� {}�ؾߵǰ�, 1���� �ص��ǰ� ���ص���!
			System.out.println("�հ�!");
			System.out.println("�����մϴ�!");
		}else
			System.out.println("���հ�!");
		System.out.println("����"); */           //else���� ������� ��µ�(�� else���� 1���� {}���ѰŴϱ�!)

		if(score<50){
			System.out.println("���հ��Դϴ�.");
		}else if(score<60){                     //else�� ���� �ȵǴ� ����: if�� ���� �ƴ϶�� �Ҹ� x
			System.out.println("��Ÿ���� ���հ��Դϴ�.");
		}else if(score<70){
			System.out.println("�հ��Դϴ�.");
		}else if(score<80){
			System.out.println("����ϰ� �հ��Դϴ�.");
		}else{
			System.out.println("���� ����ϰ� �հ��Դϴ�.");
		}
			
		}
	}
	

