/*�ݺ��� for �ȿ��� ���ù� if���� ���Ǵ� �� ���� ��) 
ex)3�� �Ҽ��ΰ���?
��������
����� ������ 2���� ��
�Ҽ��� 1�� �ڱ��ڽ����θ� ���������� ��

����)����ڿ��� � �� n�� �Է¹޾� �Ҽ����� �ƴ��� �Ǻ��ϴ� ���α׷� �ۼ�
*/

import java.util.Scanner;
class ForExam10
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, cnt=0;                         //1�����)����� ������ ���ؼ� �Ҽ����� �Ǻ�
		System.out.print("n�� �Է��ϼ���.==>");
		n = sc.nextInt();

		for(int i=1; i<=n; i++){
			if(n%i==0){                       //i�� n�� �����?
				cnt++;
			}
		}
		if(cnt==2){
			System.out.println(n+"�� �Ҽ��Դϴ�.");
		}else{
			System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
		}
	}
}
/*��°��
n�� �Է��ϼ���==>10
10�� �Ҽ��� �ƴմϴ�

n�� �Է��ϼ���==>5
5�� �Ҽ��Դϴ�
*/