class IncrementDeCreament 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = 5;
		i++;   // ++�� �տ����� �ڿ����� ����(�ܵ����� ���Ǿ����ϱ�) i = i+1  //���6
		++j;   // j = 1+j                                        //���6
		System.out.println(i);
		System.out.println(j);

		int n = 5;
		int m = 5;
		n--;
		--m;
		System.out.println(n);   //���4
		System.out.println(m);   //���4

		System.out.println("------------------------");
		//a++�� a+1�� �ٸ��ϴ�! //a�� ���� ������? 
		int a = 10;
		int b = 10;
		System.out.println(a+1); //�׳� a+1�̰� a�� �������� ����     //���11
		System.out.println(b++);  // 10�� b�� �����ϰ� b+1�� �ض�, �� �ΰ����� �ٸ�!   //���10
		System.out.println("------------------------");

		i = 5;
		j = 5;
		a = ++i; // i=i+1�ϰ� �� i�� a�� �����ض�
		b = j++; // j�� b�� �����ϰ� �� ���Ŀ� j+1�� �ض�
		System.out.println("i:"+ i);  //6
		System.out.println("j:"+ j);  //6
		System.out.println("a:"+ a);  //6
		System.out.println("b:"+ b);  //5
		System.out.println("------------------------");

		i=5;
		j=5;
		int k = 5;
		System.out.println(++i); //i�� 1�� ���ض� 6
		System.out.println(j++); //j�� ����ϰ� ���߿� �����ض� 5
		System.out.println(k+1); //5+1 = 6 
		System.out.println(i); //���������ϱ� 6
		System.out.println(j); //���������ϱ� 6
		System.out.println(k);  //������� 5

	}
}
