//while�� ����)������ ���


class WhileExam2 
{
	public static void main(String[] args) 
	{
		int dan = 2;
		while(dan<=9){
			System.out.printf("***%d��***\n",dan);      //��������
			int i=1;            //�ʱⰪ
			while(i<=9){        //���ǽ�
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
				i++;            //������
			}
			dan++;
			System.out.println();
		}
	}
}
