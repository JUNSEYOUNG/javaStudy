//Random ����(���� �������� ������ �� ���)       //Scanner�ڸ��� Random�� ����~?����

import java.util.Random;
class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt(); //int�� �������� �ƹ��ų� 1�� �������� ������� 
		                        //��û���� �����ϼ���, ��ûū ����ϼ���! ����Ҷ����� �� �޶���
		System.out.println(n);
	}
}
