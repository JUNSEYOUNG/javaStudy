//while�� ����) ����ڿ��� n�� �Է¹޾� n!�� ���Ͽ� ����ϴ� ���α׷� �ۼ�
/*<���� ��>
n�� �Է��ϼ��� ==> 5
5*4*3*2*1=120           //������������
*/

import java.util.Scanner;
class WhileExam3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, sum=1;
		System.out.println("n�� �Է��ϼ���.==>");
		n = sc.nextInt();

		int i=n;
		while(i>=1){
			System.out.print(i);
			if(i != 1){
				System.out.print("*");
			}
			sum*=i;
			i--;
		} 
		System.out.println("=" + sum);
	}
}
