/*���ù��� �ݺ���) ����ڷκ��� 3���� ������ �о���� �� 
if-else���� ����Ͽ� ���� ���� ���� �����ϴ� ���α׷� �ۼ�
*/

import java.util.Scanner;
class Test05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c;
		System.out.println("ù��° ������ �Է��ϼ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ������ �Է��ϼ���.");
		b = sc.nextInt();
		System.out.println("����° ������ �Է��ϼ���.");
		c = sc.nextInt();
		
		if(a<b){
			if(a<c){
				System.out.println("���� ���� ��: " + a+ "�Դϴ�.");
			}else{
				System.out.println("���� ���� ��: " + c+ "�Դϴ�.");
			}
		}else{       //a>b
			if(b<c){
				System.out.println("���� ���� ��: " + b+ "�Դϴ�.");
			}else{
				System.out.println("���� ���� ��: " + c+ "�Դϴ�.");
			}
		}
}
}