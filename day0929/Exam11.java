//����ġȯ������ +=  -=  *=  /+  %=  >>=   <<=  ����)
//������ ���� �����ϴ� ���α׷� �ۼ��غ���
//<���� ��> 1���� � ������ ���ұ��?      �Է¹޾Ƽ�        //1���� � �������� i=i; �̰� ��ߵǼ� for�� ���ڱ���!
//        1���� 7������ ���� ____�Դϴ�.   ���

import java.util.Scanner;
class Exam11
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n,sum=0,i;
		System.out.println("1���� � ������ ���ұ��?");
		n = sc.nextInt();

		for(i=1; i<=n; i++){
			sum += i;    //sum=sum+i
		}

        System.out.println("**��°��**");
		System.out.println("1����" +n+ "������ ����" + sum + "�Դϴ�."); 
	}
}
