//비트연산자 실험 & | ^
//java 개발자가 현장에서 비트연산 할일은 없지만 상식으로 알아두기

class BitTest 
{
	public static void main(String[] args) 
	{
		int a = 10;          //a를 2진수로 만들기 > 0000 1010  (8자리)
		int b = 20;          //b를 2진수로 만들기 > 000 10100  (8자리)  
		int i = a & b;       //00000000
		int j = a | b;       //00011110
		int k = a ^ b;       //00011110

		System.out.println("i="+i); //0
		System.out.println("j="+j); //30
		System.out.println("k="+k); //30 
	}
}
