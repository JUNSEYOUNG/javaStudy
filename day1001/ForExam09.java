/*�ݺ��� for �ȿ��� ���ù� if���� ���Ǵ� �� ����)                    //if�� �ȿ��� ���ǽ��� ��
ex) 4�� �����?
1,2,4 �̿�!

����)��������� � n�� �Է¹޾� n�� ����� ��� ����ϴ� ���α׷� �ۼ�
*/

import java.util.Scanner;
class ForExam09
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.print("n�� �Է��ϼ���.==>");
		n = sc.nextInt();

		System.out.print(n+"�� ����� ");

		//� �� i�� 1���� �����ؼ� 1,2,3,4,...n�� �� ������
		for(int i=1; i<=n; i++){
			if(n%i==0){   //n�� i�� ���� ������ ���� 0�� �Ǵ�? == i�� n�� �����?
			System.out.print(i + " ");             //+ " "�� �ϴϱ� ��ĭ ���Ⱑ �ǳ�
			}
		}
		System.out.println("�Դϴ�.");
	}
}
