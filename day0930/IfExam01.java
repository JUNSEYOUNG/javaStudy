//����)���>���ù�>if�� 
//��������� ������ �� n�� �Է¹޾� n�� ����̸� �� ���� 100�� ���� ����
//����� ���� "�۾�����"�� ����ϰ� �׷��� ������ �� ���� ������ ����� ����
//"�۾�����"�� ����ϵ��� ���α׷� �ۼ�


import java.util.Scanner;
class IfExam01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("������ �� n�� �Է��ϼ���.");
		n = sc.nextInt();

		if(n>=0){           //n�� �����?
			System.out.println(n + 100);
		}else{
            System.out.println(n*n);
		}
         System.out.println("�۾�����");
	}
}
