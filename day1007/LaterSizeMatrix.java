//�������迭) ũ�� ���߿� ���ϴ� ����

class LaterSizeMatrix 
{
	public static void main(String[] args) 
	{
		int[][] a;
		a = new int[3][4];   //12ĭ

		int n = 1;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){   //������ �� �Ȱ����ϱ� i�� 0�� �͵���
				a[i][j] = n++;
			}
		}
		for(int i=0; i<a.length; i++){  //��� �迭�� ��� ���
			for(int j=0; j<a[i].length; j++){
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
	}
}
