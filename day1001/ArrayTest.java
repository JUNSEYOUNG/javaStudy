//�迭 ����) 5���� ������� ��ճ��̸� ����Ͽ� ����ϴ� ���α׷� �ۼ�


class ArrayTest
{
	public static void main(String[] args) 
	{

		int []age = {27,28,26,29,28};
		int sum = 0;             //���̸� �� ���ؾ��ϴϱ�!
		for(int i=0; i<age.length; i++){
			sum += age[i];             //sum = sum + age[i]; ����ǥ����
	}

	double avg = (double)sum / age.length;     //��ձ��ϱ�(�Ǽ�������)
	System.out.println("��ճ���:" + avg);
	
}
}

//������: ��ճ���27.6