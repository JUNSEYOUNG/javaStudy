/*���� n�� ���� 100�̶�� �����غ��ô�
20���� �ݺ������� i�� 2�� �� 21���� ���ǽ��� �����Ͽ�
flag�� false�� ���
�̹� i�� 2�� �� n�� �Ҽ��� �ƴ��� ������
���� i�� �������� 3�϶� �Ǻ��ϰ� 4�϶� �Ǻ��Ͽ�
�޿� 99���� ������ ��� �ʿ����
�׷��� flag�� false�� ��� ���� �ݺ��� Ż���ϵ��� �ϴ°��� ������
*/

import java.util.Scanner;
class ForExam1003
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;      
		boolean flag = true;              //�Ҽ����� ���ϴ� �������� , true�� false�̿��ؼ�!
		System.out.print("n�� �Է��ϼ���.==>");
		n = sc.nextInt();

		for(int i=2; i<n; i++){
			if(n%i==0){                    //i�� n�� �����?  
			flag = false;
			break;                 //n�� 100�̶�� i�� 2�϶� Ż��, n�� 9��� i�� 3�϶� Ż�� 
		}
	}

	//if(flag==true){                           // if(flag)�� ��� ���°Ŷ� ����!
	if(flag){
		System.out.println(n+"�� �Ҽ��Դϴ�.");
	}else{
		System.out.println(n+"�� �Ҽ��� �ƴմϴ�.");
	}
}
}

/*��°��:
n�� �Է��ϼ���==>5
5�� �Ҽ��Դϴ�
*/

		