//����ġȯ������ ����)�������� ��� �����غ���

class CompoundOperatorTest 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;

		//�Ʒ� sum += i;�� 3���̳� �ݺ��Ǵϱ� �ݺ��� for�� ����غ�����!
		//for(i=1; i<=3; i++){
		for(i=1; i<=100; i++){
			sum += i;  //sum=sum+i  //sum�� +i�ؼ� for�� ���������� �ϴ°ǰ�?
		}


		/*
		sum += i;     //sum=sum+i  //sum=0+1  //���:1

		i++;          //i=i+1      //i=1+1    //���:2
		sum += i;     //sum=sum+i  //sum=1+2  //���:3

		i++;          //i=i+1      //i=2+1    //���:3
		sum += i;     //sum=sum+i  //sum=3+3  //���:6
		*/
		
		System.out.println("i:"+i);       //3
		System.out.println("sum:"+sum);   //6
	}
}
