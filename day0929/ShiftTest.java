//비트 이동연산자 << >>실험

class ShiftTest 
{
	public static void main(String[] args) 
	{
		int data = 4;
		System.out.println(data << 1); //data를 왼쪽으로 1비트 이동 //*2하니까 8이 됨
        System.out.println(data << 2); //*2한 값 8에다가 또 *2하니까 16이 됨
        System.out.println(data >> 1); //data를 오른쪽으로 1비트 이동 // /2하니까 2가 됨 
	}
}
