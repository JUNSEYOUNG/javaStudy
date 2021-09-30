class IncrementDeCreament 
{
	public static void main(String[] args) 
	{
		int i = 5;
		int j = 5;
		i++;   // ++는 앞에오나 뒤에오나 같음(단독으로 사용되었으니까) i = i+1  //결과6
		++j;   // j = 1+j                                        //결과6
		System.out.println(i);
		System.out.println(j);

		int n = 5;
		int m = 5;
		n--;
		--m;
		System.out.println(n);   //결과4
		System.out.println(m);   //결과4

		System.out.println("------------------------");
		//a++와 a+1은 다릅니다! //a랑 같이 쓰였네? 
		int a = 10;
		int b = 10;
		System.out.println(a+1); //그냥 a+1이고 a에 대입하지 않음     //결과11
		System.out.println(b++);  // 10을 b에 저장하고 b+1을 해라, 위 두가지는 다름!   //결과10
		System.out.println("------------------------");

		i = 5;
		j = 5;
		a = ++i; // i=i+1하고 그 i를 a에 저장해라
		b = j++; // j를 b에 저장하고 그 이후에 j+1을 해라
		System.out.println("i:"+ i);  //6
		System.out.println("j:"+ j);  //6
		System.out.println("a:"+ a);  //6
		System.out.println("b:"+ b);  //5
		System.out.println("------------------------");

		i=5;
		j=5;
		int k = 5;
		System.out.println(++i); //i에 1을 더해라 6
		System.out.println(j++); //j를 출력하고 나중에 증가해라 5
		System.out.println(k+1); //5+1 = 6 
		System.out.println(i); //증가했으니까 6
		System.out.println(j); //증가했으니까 6
		System.out.println(k);  //변동없어서 5

	}
}
