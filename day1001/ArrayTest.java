//�迭 ����) 5���� ������� ��ճ��̸� ����Ͽ� ����ϴ� ���α׷� �ۼ�      //�迭�� ���, sum, avg ���;߰ڳ�


class ArrayTest
{
	public static void main(String[] args) 
	{

		int[] age = {30,33,28,21,17};
		int sum = 0;             //���̸� �� ���ؾ��ϴϱ�!
		for(int i=0; i<age.length; i++){
			sum += age[i];             //sum = sum + age[i]; ����ǥ����
	}

	double avg = (double)sum / age.length;     //��ձ��ϱ�(�Ǽ�������)  //(double)sum / 5�� ���� ��
	System.out.println("��ճ���: " + avg);
	
}
}

/*������
��ճ���: 25.8
*/