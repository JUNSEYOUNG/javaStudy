class RangeByte 
{
	public static void main(String[] args) 
	{
		//1byte�� 8bit�� ������
		//1bit�� ǥ���� �� �ִ� ���� ������ 0,1 �ΰ�����
		//2bit�� �ִٸ� ǥ���� �� �ִ� ��ȣ�� 0 0 ,0 1, 1 0, 1 1
		//4������(������)
		//�������� ǥ���ϸ� 
		//0 0   0
		//0 1   1
		//1 0   2
		//1 1   3
		//1byte(8���� bit)�߿� �� ���ʿ� �ִ� bit�� �������� �������
		//�Ǻ��ϴ� ��ȣ��Ʈ�� ����ϰ�
		//������ 7���� ��Ʈ�� ���ڸ� ǥ����
		//���� ǥ���� �� �ִ� ���� ������ ������ ����
		//���� 2�� 7�º��� ��� 2�� 7�� -1
		//-128 ~ 127

		byte data;

		/*data = -128;
		System.out.println(data);       
		data = (byte)(data-1);          //127��� > underFlow�߻�
		System.out.println(data);*/



		/*data = 127;
		System.out.println(data);
		data = (byte)(data+1);          //-128��� > overFlow�߻�
		System.out.println(data);*/
	}
}
/*
C:\javaStudy\day0928>java RangeByte
-128
127
*/
//underFlow �߻�(���� 128���� ��� 127������ �ִ��ε�, data-1�ϴϱ� -129���ݾ�?
//���ļ� ������ ���� �� ��� 127�� ������ �� ����)



/*
C:\javaStudy\day0928>java RangeByte
127
-128
*/
//overFlow �߻�(���� 128���� ��� 127������ �ִ��ε�, data+1�ϴϱ� 128���ݾ�?
//���ļ� ������ ���� �� ���� 128�� ������ �� ����) 
