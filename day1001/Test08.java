/*���ù��� �ݺ���) 2�� 100���̿� �ִ� ��� �Ҽ�(prime number)�� ã�� ���α׷� �ۼ�
�־��� ���� k�� 2���� k-1������ ���ڷ� ����� �������� 0�� ���� 
�ϳ��� ������ �Ҽ��� �ƴϴ�
*/

class Test08 
{
	public static void main(String[] args) 
	{
		for(int i=2; i<=100; i++){
			int k = 0;
			for(int j=2; j<=i-1; j++){
				if(i%j==0){
					k++;       //�Ҽ��� �ƴҰ��
				} 
				if(k==0)
					System.out.print(i + " ");
			}
		}
	}
}
