//do while����) ������ ���� �����ϴ� ���α׷��� �ۼ�

/*<���� ��>
�ټ��� �Է��ϼ���==>3
ĭ���� �Է��ϼ���==>5
*****
*****
*****
*/

import java.util.Scanner;
class DoWhileExam3 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a,b;
		System.out.println("�� ���� �Է��ϼ���.");
		a = sc.nextInt();
		System.out.println("ĭ ���� �Է��ϼ���.");
		b = sc.nextInt();
		
		int i,j;       //i�� �ټ�, j�� ĭ��
		
		i=1;
		do{
			j=1;
			do{
				System.out.print("*");
				j++;

			}while(j<=b);  //ĭ����ŭ �ݺ�
			System.out.println();             //�ٶ�����
			i++;
		}while(i<=a); //�ټ���ŭ �ݺ�
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
