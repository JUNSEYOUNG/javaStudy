/*for�� ����)����ڿ��� n�� �Է¹޾� n!�� ���Ͽ� ������ ���� ����ϴ� ���α׷���
for���� �̿��� �ۼ�
<���� ��>
n�� �Է��ϼ��� > 5
5*4*3*2*1=___
*/

/*�ʱⰪ�� ���ǽ��� ���������� �� ���� �ʿ�� ����!
ū������ �ݴ�� �����ϸ鼭 �ݺ����� �����ų ���� ����!
*/

import java.util.Scanner;
class ForExam06
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n , sum=1; //���ϱ��ؼ� �����ؾ� �ϴϱ� �ʱⰪ 1�ֱ�
		System.out.print("n�� �Է��ϼ���==>");
		n = sc.nextInt();

		//i: 5,4,3,2,1  ���ϱ�� ���� ���� ���� �Ųٷ� �̷��� ����ǵ��� �ؾ���!
		for(int i=n; i>=1; i--){   //i--�� i=i-1��   //����ڰ� n�� �� �ִ� n����!
		sum = sum*i;
		System.out.print(i);
		if(i != 1){
			System.out.print("*");
		}
	}
        System.out.println("=" + sum);  //i�� 0�� �Ǹ� for�� Ż����
	}
}