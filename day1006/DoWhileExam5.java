//����) �ݺ���(for,while,do~while��)�� �̿��� ������ ���� �����ϴ� ���α׷� �ۼ�
/*<���� ��>
n�� �Է��ϼ���==>5
*
**
***
****
*****
*/

import java.util.Scanner;
class DoWhileExam5 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;   //�ټ�
		int i,j; //�ټ�,ĭ���� ���� ����
		System.out.print("n�� �Է��ϼ���==>");
		n = sc.nextInt();

		/*
		//for��
		for(i=1; i<=n; i++){
			for(j=1; j<=i; j++){  //i�� 1�̸� j�� 1����
				System.out.print("*");
			}
			System.out.println();
		}
		*/

		/*
		//while��
		i=1;
		while(i<=n){
			j=1;
			while(j<=i){
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
		}
		*/

		//do while��
		i=1;   //i�� 1�̸� ���� �Ѱ�����ϰ� �ٹٲ�
		do{
			j=1;
			do{
				System.out.print("*");
				j++;
			}while(j<=i);
			System.out.println();
			i++;
		}while(i<=n);
		}
}

/*do while�� �ؼ�
n: 3
i: 1
j: 1
�ϴ� �����ϰ� ���ǽ��� ���߿� �˻���
*/
