//�޼ҵ� ����) ���� �ΰ��� �޾Ƽ� ū ���� �޾ƿ��� ���α׷� �ۼ�

class MyUtil
{
	int getMax(int a,int b){         //return���� �ڷ��� ����
		int max=a;    //a��� ����
		if(b>max){
			max = b;
		}
		return max;                  //max��� ���ϰ� ����
	}
}


class MethodTest3
{
	public static void main(String[] args) 
	{
      int age1 = 26;     //����ϴ� �ڵ��ۼ�
	  int age2 = 28;
	  int result;
	  MyUtil util = new MyUtil();
	  result = util.getMax(age1,age2);           //ū���� ã���ּ��� ã���� result�� ����ּ���
	  System.out.println(result);
	}
}
