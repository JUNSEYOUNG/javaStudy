//if-else ��ø���ù� ����) ����ڿ��� 3���� ���� �Է¹޾� �� �߿�
//���� ū ���� ã�� ����ϴ� ���α׷� �ۼ�

import java.util.Scanner;
class IfExam03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		System.out.println("ù��° ���� �Է��ϼ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ���� �Է��ϼ���.");
		b = sc.nextInt();
		System.out.println("����° ���� �Է��ϼ���.");
		c = sc.nextInt();
		
	
		if(a>b){
			if(a>c){               //��ø���ù� �ȸ��򰥸���
				max=a;
			}else{
				max=c;             //��ø���ù����� else�� ���� ���� ���� ����� if�� ������
			}
		}else{
			if(b>c){
				max = b;
			}else{
				max = c;
			}
			}
        System.out.println("���� ū����" + max + "�Դϴ�.");

}
}