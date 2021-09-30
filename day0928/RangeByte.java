class RangeByte 
{
	public static void main(String[] args) 
	{
		//1byte은 8bit로 구성됨
		//1bit로 표현할 수 있는 수의 범위는 0,1 두가지임
		//2bit가 있다면 표현할 수 있는 신호는 0 0 ,0 1, 1 0, 1 1
		//4가지임(이진수)
		//십진수로 표현하면 
		//0 0   0
		//0 1   1
		//1 0   2
		//1 1   3
		//1byte(8개의 bit)중에 맨 왼쪽에 있는 bit는 음수인지 양수인지
		//판별하는 부호비트로 사용하고
		//나머지 7개의 비트로 숫자를 표현함
		//따라서 표현할 수 있는 수의 범위가 다음과 같음
		//음수 2의 7승부터 양수 2의 7승 -1
		//-128 ~ 127

		byte data;

		/*data = -128;
		System.out.println(data);       
		data = (byte)(data-1);          //127출력 > underFlow발생
		System.out.println(data);*/



		/*data = 127;
		System.out.println(data);
		data = (byte)(data+1);          //-128출력 > overFlow발생
		System.out.println(data);*/
	}
}
/*
C:\javaStudy\day0928>java RangeByte
-128
127
*/
//underFlow 발생(음수 128부터 양수 127까지가 최대인데, data-1하니까 -129없잖아?
//넘쳐서 엉뚱한 제일 끝 양수 127이 나오게 된 것임)



/*
C:\javaStudy\day0928>java RangeByte
127
-128
*/
//overFlow 발생(음수 128부터 양수 127까지가 최대인데, data+1하니까 128없잖아?
//넘쳐서 엉뚱한 제일 끝 음수 128이 나오게 된 것임) 
