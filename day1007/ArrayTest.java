//배열

class ArrayTest2
{
	public static void main(String[] args) 
	{
		int[] a;
		a[0] = 5;                   //배열을 선언하기만 하고 몇개가 필요한지 정해지지 않았으므로
		System.out.println(a[0]);   //오류발생 > int[] a = new int[5]; 가 맞음
	}
}
