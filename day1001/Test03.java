/*���ù��� �ݺ���) ����ڿ��� �ϳ��� ���ڸ� �Է¹޾Ƽ� 
���ڰ� 'R'�̸� �簢���� ������ ����ϰ�
'T'�̸� �ﰢ���� ������, 'C'�̸� ���� ������ ����Ѵ�
������ ����ϴµ� �ʿ��� ���ڵ��� ����ڷκ��� �Է¹޴´�
*/

import java.util.Scanner;
class Test03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String n = "";
		System.out.println("���� �ϳ��� �Է��ϼ���. R/T/C");
		n = sc.next();
		double w,h;
		System.out.println("���� ���̸� �Է��ϼ���.");
		w = sc.nextDouble();
		System.out.println("���� ���̸� �Է��ϼ���.");
		h = sc.nextDouble();

		if(n.equals ("R")){
		System.out.println("�簢���� ����: " + (w*h));
		}else if(n.equals ("T")){
			System.out.println("�ﰢ���� ����: " + (w*h)/2);
		}else if(n.equals ("C")){
			System.out.println("���� ����: " + (w*h)*3.14);
	}
}
}
