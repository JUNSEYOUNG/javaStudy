/*���� ��������) 5�� �л��� �̸��� ������ �Է¹޾� 
������ ���������� �����Ͽ� ����ϴ� ���α׷��� �ۼ��Ͻÿ�.(�������� ����)

< ���� �� >
1��° �л��� �̸� ==> ȫ�浿
1��° �л��� ���� ==> 50
2��° �л��� �̸� ==> �̼���
2��° �л��� ���� ==> 100
3��° �л��� �̸� ==> ������
3��° �л��� ���� ==> 80
4��° �л��� �̸� ==> ������
4��° �л��� ���� ==> 60
5��° �л��� �̸� ==> ������
5��° �л��� ���� ==> 70


** ������ ���� **
�̼���	100
������	80
������	70
������	60
ȫ�浿	50
*/

import java.util.Scanner;
class TeamTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] score = new int[5];

		for(int i=0; i<name.length; i++){
			System.out.print(i+1 + "��° �л��� �̸�==>");  //1��°
			name[i] = sc.next();
			System.out.print(i+1 + "��° �л��� ����==>");  //1��°
			score[i] = sc.nextInt();
		}

        for(int i=0; i<score.length; i++){
			for(int j=i+1; j<score.length; j++){       //���ϴ� �� j
				if(score[j] > score[i]){               //j�� ������ �;ߵǰ� i�� �ڸ��� �ٲ�ߵǴ°���?
					int temp = score[i];
					score[i] = score[j];               //�¹ٲٱ�
					score[j] = temp;

					String temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
			}
				
				}
				
			}
		System.out.println("***������(��������) ���� ���***");
			for(int i=0; i<score.length; i++){
				System.out.println(name[i] + " " + score[i]);
		}
	}
}
