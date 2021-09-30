//비트연산자 실험  & | ^
//(맞바꿀때 임시변수 1개 생성해야한다는 점) <1번방법>  //그런데 이걸 더 많이 사용함! 나도 이게 쉽네~!
//(비트차^ 사용해서 정수끼리는 임시변수 안 만들어도 서로 값 바꿀 수 있다는 점) <2번방법>

class SwapTestInt 
{
	public static void main(String[] args) 
	{
		int a = 7;
		int b = 9;

		System.out.println("a="+a);
	    System.out.println("b="+b);

        //아래에 a,b의 내용을 맞바꾸는 코드작성

        /*int c;      //새로운 임시변수 c생성 <1번방법>
		c = a;
		a = b;
		b = c;*/

		a = a^b;      //비트차^ 사용해서 정수끼리는 임시변수 안 만들어도 서로 값 바꿀수있음 <2번방법>
		b = b^a;
        a = a^b;

		System.out.println("a와 b의 값을 서로 바꾸었습니다.");
		System.out.println("a="+a);
	            System.out.println("b="+b); 

	}
}
