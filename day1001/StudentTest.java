//ArrayTest�� ���õ� �迭����)
//�Ʊ� 5���� �̸��̶� ���� ���� ����ϱ�

class StudentTest
{
	public static void main(String[] args) 
	{
		String []name = {"���Ͽ�","�����","���ڿ�","������","�ڼ���"};
		int []age = {27,28,26,29,28};
		
		int tot = 0;   //��ճ��̰��
		for(int i=0; i<name.length; i++){
			System.out.println(name[i] + ":" + age[i]);
            tot += age[i];       //�ݺ��� ���������� ���� ��ü������ �� ���ϱ�
		}
		double avg = (double) tot / age.length;
		System.out.println("��ճ���:" + avg);
	}
}
