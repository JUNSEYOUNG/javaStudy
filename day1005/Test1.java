//pdf ���ù��� �ݺ��� ����) exercise 6���� 2�� ���α׷��� (�ñ׸�����-��ø�ݺ���)
//���н��� ����ϴ� �ڵ��ۼ�

class Test1 
{
	public static void main(String[] args) 
	{
		int sum = 0;                   //������ �� ���ϱ�
		for(int i=10; i<=30; i++){     //i�� 21�� ��
			for(int j=0; j<=5; j++){    //��ø�ݺ���
				sum += i*j;
			}
		}
		System.out.println(sum);       //int�� for�� �ۿ��� ���������ϱ� ��µ� for�� �ۿ���!
	}
}
