/*for�� ����) ����ڿ��� � �� n�� �Է¹޾� 1���� n������ ¦���� ��, Ȧ���� ��,  
¦���� ����, Ȧ���� ������ ���� ���Ͽ� ����ϴ� ���α׷� �ۼ� 
*/

import java.util.Scanner;
class ForExam08
{
	public static void main(String []args)
	{
		Scanner sc = new Scanner(System.in);
		int n, even_sum=0, odd_sum=0, even_cnt=0, odd_cnt=0;    //¦�� ��, Ȧ�� ��, ¦�� ����, Ȧ������ �ޱ����� ��������
		System.out.print("n�� �Է��ϼ���.==>");
		n = sc.nextInt();

		//����ڰ� � �� n�� �Է������� �𸣰����� 
		//i: 1,2,3,4,5,6...n 
		//i�� 1�̸� ¦���� Ȧ����? �����

		for(int i=1; i<=n; i++){
			if(i%2==0){
				even_sum += i;//even_sum = even_sum + i;  //¦���� �����ؾ� �ϴϱ� ¦���� i�� ���ϴ� ��
				even_cnt++; //even_cnt = even_cnt + 1;  //���� �����ؾ� �ϴϱ� 1���� ���ϱ�
			}else{
				odd_sum += i;
				odd_cnt++;
			}
		}
		System.out.println("1���� " +n+ "������ ¦���� ��"+ even_sum);
		System.out.println("1���� " +n+ "������ ¦���� ����"+ even_cnt);
		System.out.println("1���� " +n+ "������ Ȧ���� ��"+ odd_sum);
		System.out.println("1���� " +n+ "������ Ȧ���� ����"+ odd_cnt);
	}
}