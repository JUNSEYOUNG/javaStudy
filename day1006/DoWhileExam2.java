//do while�� ����)����ڿ��� n�� �Է¹޾� 1���� n������ ���� �����Ͽ�
//����ϴ� ���α׷� �ۼ�

import java.util.Scanner;
class DoWhileExam2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n, sum=0;                      //���� �����Ϸ��� sum�����ϰ� 0�ʱⰪ ��
		System.out.print("n�� �Է��ϼ���.");
		n = sc.nextInt();

		int i=1;
		do{
			sum += i;
			i++;
		}while(i<=n);
		System.out.printf("1���� %d������ ���� %d�Դϴ�.",n,sum);  //ù��° %d�� n, %d�� sum
	}
}


/*
[do while���� ����]

�ʱⰪ;
do{
   �ݺ� ������ ��ɾ��;
   ������;
}while(���ǽ�);
*/
