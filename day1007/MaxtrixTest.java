//�������迭(�������迭)

class MaxtrixTest 
{
	public static void main(String[] args) 
	{
		int[][] a;
		a = new int[5][3]; //5��(i) 3��(j) //�����ε���:0~4,�����ε���:0~2

		int n = 1;
		for(int i=0; i<5; i++){    //�����ε��� 4����
			for(int j=0; j<3; j++){      //�����ε��� 2����
				a[i][j] = n++;   //��ɾ� 15�� ������(15���� �迭�� 1�� ������ �� �ֱ�)
				//0  0
				//0  1
				//0  2
				//1  0
				//1  1
				//1  2
				 // .
				 // .
			}
		}



		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				System.out.printf("%5d",a[i][j]);   //5d > 5ĭ�� ��Ƽ� ����ض�
			}
			System.out.println();  //�� ���� ��� ��µǸ� �ٹٲٱ�
			}
		}
	}
