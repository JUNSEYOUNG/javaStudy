//����, ��ǥ ��������̱� �ڵ�

import java.util.Random;
class StudentRandom 
{
	public static void main(String[] args) 
	{
		String[] names= {"�����","��þ�","������","������","�ڼ���","������","���ϸ�",
			"������","������","�̰ǿ�","�ӻ���","���Ͽ�","������","���ڿ�","����ȣ"};

		for(int i=0; i<100; i++){                              //0�ε���~99�ε������� > 1~100����
			System.out.print(names[i%names.length]+"\b\b\b");  //���� �� �ٲ�, ���ڸ��� �������� ���ư�
			try{
				Thread.sleep(100);      //�����尡 �۵��ؼ� �������� ���ư�
			}catch(Exception e){}
		}

		Random rand = new Random();     //���� ��밡������
		int n = rand.nextInt();
		n = n >>> 1;                    //��û ū ���� �߻��ϴϱ� �������� �ʿ�
		n = n%15;                       //0~14���� �����߻� , n��°�� ��÷�ڰ� ��
		System.out.println("***��÷��***");
		System.out.println(names[n]);


	}
}
