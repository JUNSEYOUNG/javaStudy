/*���ù��� �ݺ���) �������� �ϳ��� 100���� ������ �Ǹ��ϰ� �ִٰ� ��������
������ 10�� �̻� �����ϴ� �����Դ� 10%�� �������شٰ� ����
����ڰ� ������ ������ ������ �Է��ϸ� ��ü ������ �������� ������ִ� ���α׷� �ۼ�
�� ������ ������ 10�� �̻��̸� 10%������ �������� ����Ͽ��� �Ѵ�
if-else���� ����϶�
*/

import java.util.Scanner;
class Test04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cnt, total, price = 100;
		System.out.println("100�����Դϴ�. 10�� �̻� �����Ͻø� 10% �����ص帳�ϴ�.");
		System.out.print("�� �� �����Ͻðڽ��ϱ�?===> ");
		cnt = sc.nextInt();
		total = price * cnt;

		if(cnt>=10){
			total = (int)(total*0.9);
		}
		System.out.println("��ü������ " + total + "���Դϴ�.");
	}
}
