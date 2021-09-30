//Random 연습(정수 범위에서 무작위 수 출력)       //Scanner자리에 Random이 오네~?ㅎㅎ

import java.util.Random;
class ShiftThreeRandomTest 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt(); //int의 범위에서 아무거나 1개 무작위로 만들어줌 
		                        //엄청작은 음수일수도, 엄청큰 양수일수도! 출력할때마다 값 달라짐
		System.out.println(n);
	}
}
