/*��������) 
4�������� ������ ��� 10���� �Է¹޾� ���� ������ �Ǻ��Ͽ�
OX�� ����ϰ� ������� Ʋ������� ���� ���Ͽ� �����
(��! ������ �̸� ���α׷����� �ʱ�ȭ��)

<���� ��>
1������ �Է��ϼ���==> 1
2������ �Է��ϼ���==> 4
3������ �Է��ϼ���==> 2
...
10������ �Է��ϼ���==>2

1   O
2   X
3   O
...
10  O

�����:8��
Ʋ����:2��
*/
//�迭����

import java.util.Scanner;
class TeamTest
{
	public static void main(String[] args) 
	{
		int []quiz = {3,1,3,4,1,2,4,2,3,3};
		Scanner sc = new Scanner(System.in);
		int []answer = new int[10];
		int cnt_o = 0, cnt_x = 0;
		for(int i=0; i<quiz.length; i++){      //�迭�� ������ i�� 0����!
			System.out.print((i+1)+ "�� ���� �Է��ϼ���.==>");
			answer[1] = sc.nextInt();
		}
		System.out.println();
		System.out.println("***������***");

		for(int i=0; i<quiz.length; i++){
			if(quiz[i]==answer[i]){
				System.out.println((i+1)+ "  o");
				cnt_o++;
			}else{
			    System.out.println((i+1)+ "  x");
				cnt_x++;
			}
		}

		System.out.println();
		System.out.println("�����: " + cnt_o);
		System.out.println("Ʋ����: " + cnt_x);
	}
}