/*���ù��� �ݺ���) ����ڷκ��� 3���� ������ �о���� �� 
if-else���� ����Ͽ� ���� ���� ���� �����ϴ� ���α׷� �ۼ�
*/

import java.util.Scanner;
class Test05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, min;
		System.out.println("ù��° ������ �Է��ϼ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		b = sc.nextInt();
		System.out.println("����° ������ �Է��ϼ���.");
		c = sc.nextInt();
		
		/*if(a<b){
			if(a<c){
				System.out.println("���� ���� ��: " +a+ "�Դϴ�."); //min = a;
			}else{
				System.out.println("���� ���� ��: " +c+ "�Դϴ�."); //min = c;
			}
		}else{       //a>b
			if(b<c){
				System.out.println("���� ���� ��: " +b+ "�Դϴ�."); //min = b;
			}else{
				System.out.println("���� ���� ��: " +c+ "�Դϴ�."); //min = c;
		
		}
}
}
}
*/

		if(a<b && a<c){
			min = a;
		}else if(b<a && b<c){
			min = b;
		}else{
			min = c;
		}
		System.out.println("���� ���� ���� " +min+ "�Դϴ�.");
	}
}
