//��Ʈ �̵������� << >> ����)

class ShiftThreeTest 
{
	public static void main(String[] args) 
	{
		int data = -4;
		System.out.println(data >> 1); //data�� ���������� 1��Ʈ �̵��ض�(/2) //���:-2
		System.out.println(data >>> 1); //������ 0���� ä������ ������ �� ���� ��û ū ����� ���� //���:2147483646

		// >> : ������2(���� �پ��)
		// >>>: ��û ū �������(> �Ѱ� ���ε� ��û �ٸ� ����� ������!)
	}
}
