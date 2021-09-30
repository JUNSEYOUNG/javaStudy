//비트 이동연산자 << >> 연습)

class ShiftThreeTest 
{
	public static void main(String[] args) 
	{
		int data = -4;
		System.out.println(data >> 1); //data를 오른쪽으로 1비트 이동해라(/2) //결과:-2
		System.out.println(data >>> 1); //무조건 0으로 채워져서 예측할 수 없고 엄청 큰 양수가 나옴 //결과:2147483646

		// >> : 나누기2(값이 줄어듦)
		// >>>: 엄청 큰 양수나옴(> 한개 차인데 엄청 다른 결과가 나오네!)
	}
}
