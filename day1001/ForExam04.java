/*for�� ����) ����ڿ��� ������ �߿� ����� ������� �Է��Ͽ� ������ ����
�ش� �������� ����ϴ� ���α׷� for���� �̿��� �ۼ�
<<���� ��>>
������ �߿� ����� ����ұ��?
2��� �Է��ϸ� >
2*1=2                //������ �� 123456789�� i��!
2*2=4
2*3=6
...
*/

import java.util.Scanner;
class ForExam04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("������ �߿� ����� ����ұ��?");
		n = sc.nextInt();

		for(int i=1; i<=9; i++){
			System.out.println(n + "*" + i + "=" + (n*i));
		}
	}
}
