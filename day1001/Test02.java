/* ���ù��� �ݺ���) ������ ���� ���α׷� �ۼ�
����ڷκ��� �ϳ��� ���ڸ� �Է¹ް� �̾� 2���� ���ڸ� �Է¹޴´�
���� ���ڰ� '+'�̸� �� ���� ������, '-'�̸� ������,
'x'�̸� ������, '/'�̸� �������� �����ϵ��� �ۼ�
if-else�� ����ϰ� �������� ��� �и� 0�� �ƴ����� ���� �˻��Ͽ��� �Ѵ�
*/

import java.util.Scanner;
class Test02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String n = "";
		System.out.println("�ϳ��� ���ڸ� �Է��ϼ���.(+,-,x,/)");
		n = sc.next();
		int a = 0;
		int b = 0;
		System.out.println("ù��° ���ڸ� �Է��ϼ���.");
		a = sc.nextInt();
		System.out.println("�ι�° ���ڸ� �Է��ϼ���.");
		b = sc.nextInt();

		if(n.equals ("+")){         
			System.out.println("���� ���: " + (a+b));
		}else if(n.equals ("-")){
			System.out.println("���� ���: " + (a-b));
		}else if(n.equals ("x")){
			System.out.println("���� ���: " + (a*b));
		}else if(n.equals ("/")){
			if(b==0){
				System.out.println("�и� 0�Դϴ�.");
			}else{
			System.out.println("������ ���: " + (a/b));	
		}
		}
	}	
}
