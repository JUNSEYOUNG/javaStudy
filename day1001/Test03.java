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
		char type;
		double width, height, radius, area;

		System.out.print("������ ������ �Է��ϼ���. R:�簢��, T:�ﰢ��, C:��===>");
		type = sc.next().charAt(0);
		if(type == 'R'){
			System.out.print("�簢���� ���α��̸� �Է��ϼ���.==>");
			width = sc.nextDouble();
			System.out.print("�簢���� ���α��̸� �Է��ϼ���.==>");
			height = sc.nextDouble();
			area = width * height;
			System.out.print("�簢���� ������");
		}else if(type == 'T'){
			System.out.print("�ﰢ���� �غ��� ���̸� �Է��ϼ���.==>");
			width = sc.nextDouble();
			System.out.print("�ﰢ���� ���̸� �Է��ϼ���.==>");
			height = sc.nextDouble();
			area = width * height / 2;
			System.out.print("�ﰢ���� ������");
		}else if(type == 'C'){
			System.out.print("���� �������� ���̸� �Է��ϼ���.==>");
			radius = sc.nextDouble();
			area = 3.14 * radius * radius;
			System.out.print("���� ������");
		}else{
			System.out.println("������ ������ �߸� �����߽��ϴ�.");
			return; //���⿡�� main�޼ҵ带 �����մϴ�.
		}
		System.out.println(area + "�Դϴ�.");
	}
}
