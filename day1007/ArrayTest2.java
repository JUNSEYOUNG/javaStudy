//배열의 초기값

class ArrayTest2
{
	public static void main(String[] args) 
	{
		int[] a;
		a = new int[5];

		int[] b = new int[5];
		boolean[] c = new boolean[5];
		double[] d = new double[5];
		String[] e = new String[5];

		a[0] = 100;
		b[0] = 100;

		System.out.println(a[0]);  //100
		System.out.println(b[0]);  //100
 
		System.out.println(a[1]);  //0
		System.out.println(b[1]);  //0
		System.out.println(c[1]);  //false
		System.out.println(d[1]);  //0.0
		System.out.println(e[1]);  //null

		a[5] = 100;
		System.out.println(a[5]);  
		//배열의 길이가 5인데 인덱스는 4까지라서 5번째 인덱스에 100을 넣으려니까 인덱스 자체가 없어서 오류발생

	}
}

//배열의 초기값: boolean > false, String > null, 정수 > 0, 실수 > 0.0