/*���� n�� ���� 100�̶�� �����غ��ô�
21���� �ݺ������� i�� 2�� �� 22���� ���ǽ��� �����Ͽ�
flag�� false�� ���           //¦���� �Ҽ��� �ɼ������ϱ�!
�̹� i�� 2�� �� n�� �Ҽ��� �ƴ��� ������
���� i�� �������� 3�϶� �Ǻ��ϰ� 4�϶� �Ǻ��Ͽ�
�޿� 99���� ������ ��� �ʿ����
�׷��� flag�� false�� ��� ���� �ݺ��� Ż���ϵ��� �ϴ°��� ������
*/

import java.util.Scanner;
class ForExam1004
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;      
		System.out.print("n�� �Է��ϼ���.==>");
		n = sc.nextInt();

        int i;
		for(i=2; i<n; i++){
			if(n%i==0){                    //i�� n�� �����?  
			break;                 //n�� 100�̶�� i�� 2�϶� Ż��, n�� 9��� i�� 3�϶� Ż�� 
		}
	}

	//if(flag==true){                           // if(flag)�� ��� ���°Ŷ� ����!
	if(i==n){                   //i�� n�� �������� �� �Ҽ���, �׷��� ������ �Ҽ��� �ƴ�!
		System.out.println(n+"�� �Ҽ��Դϴ�.");
	}else{
		System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
	}
}
}

/*��°��:
n�� �Է��ϼ���==>100
100�� �Ҽ��� �ƴմϴ�
*/

		
