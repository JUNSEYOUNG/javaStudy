/*�迭,for�� �����ϱ�) 5���� ������ �Է¹޾� ��� ����ϰ� 
�ְ������� ���������� ���� ���Ͽ� ����ϱ�
*/

import java.util.Scanner;
class MaxMinOfScore
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//int[] score = new int[10];
		int[] score = new int[5];

		for(int i=0; i<score.length; i++){      //0�ε������� 4�ε�������
			System.out.print((i+1) + "��° �л��� ������ �Է��ϼ���.==>"); //i�� 0�̸� 1��° �л�, i�� 1�̸� 2��° �л�
			score[i] = sc.nextInt();
		}

		int max,min;
		max = score[0];   //�ϴ� �ִ밪�� score�� 0�ε����� ��ġ�� ����� �غ���
		min = score[0];   //�ϴ� �ּҰ��� score�� 0�ε����� ��ġ�� ����� �غ���


		//�迭 �߿� ���� ū���� ���� �������� ã����
		//���� ū���� �ƴ϶�� ���� �������� �Ǵ°��� �ƴ�
		//�׷��� ������ ū���� ã�� ���� if���� �������� ã�� ���� if���� ���� �����
		//{5,2,3,6,1}
		//���� �迭�� ���Ұ� ���� ���� �� 
		//max = 5�� ����ְ�
		//min = 2�� ����ְ�
		//i�� 2��� �� �� �迭�� i��° ������ �� 3�� max�� �� 5���� ũ�� �ʴٰ�
		//min�� ���� ���� ���� why?���� min���� i��° ������ �� 3���� �� ���� ���� �ֱ� ������
		//���� ū���� ã�� if�� else�� ó���Ͽ� ���� ���� ���� �� ����
		//ū���� ã�� if�� �������� ã�� if�� ���� �����
		for(int i=1; i<score.length; i++){  //1�ε������� 4�ε�������
			if(score[i] > max){             //score�� i��° �迭�� �ִ� ���� ���� max������ �����Ǿ��ִ� score�� 0��° �迭������ ũ�ٸ�
				max = score[i];
			}
			if(score[i] < min){            //else if�� ������ ��
				min = score[i];
			}        
		}
		System.out.println("���� ū��:" + max);
		System.out.println("���� ������:" + min);
	}
}
