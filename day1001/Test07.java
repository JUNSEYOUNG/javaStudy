/*���ù��� �ݺ���) Ư���� ������ �о�鿩�� 0�� �� ���� ���̿� �ִ� 
��� 3�� ����� ����ϴ� ���α׷� �ۼ�
���� �Է� �������� 0���� ������ ���� �޽����� ����϶�
*/

import java.util.Scanner;
class Test07 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int i, n;
		System.out.print("������ �Է��ϼ���.==>");
		n = sc.nextInt();

		if(n<0){
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("0�� " +n+ "���̿� �ִ� 3�� ���:");
		for(i=0; i<=n; i++){
			if(i%3==0) 
				System.out.print(i+ " ");
			}
		}
	}
}
