/*��������2) ���α׷��� 6�� �ۼ��ϱ�
����ڷκ��� Ű�� �Է¹޾Ƽ� ǥ�� ü���� ����� �Ŀ� ������� ü�߰� ���Ͽ�
��ü������, ǥ������, ��ü�������� �Ǵ��ϴ� ���α׷��� �ۼ�                  
ǥ�� ü�� ������ ������ ���
<ǥ��ü�� = (Ű-100)*0.9>
*/

import java.util.Scanner;
class Test02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double g;                                  //��ո�����
		int k, w;                                  //������� Ű,������
		System.out.println("������� Ű�� �Է��ϼ���.");
		k = sc.nextInt();
		System.out.println("������� �����Ը� �Է��ϼ���.");
		w = sc.nextInt();
		g = (k-100)*0.9;

		if(w<g){                                   //������� ������<��� ������
			System.out.println("��ü���Դϴ�.");
      	}else if(w>g){
			System.out.println("��ü���Դϴ�.");
		}else{
			System.out.println("ǥ��ü���Դϴ�.");	
		}

	}
}

