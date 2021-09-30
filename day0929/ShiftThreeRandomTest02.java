//Random 연습) 0에서 9사이의 난수가 발생하도록 프로그램 수정해보기
import java.util.Random;
class ShiftThreeRandomTest02 
{
	public static void main(String[] args) 
	{
		Random rand = new Random();
		int n = rand.nextInt();
		System.out.println(n);

		//여기부터 연습시작 
		n = n >>> 1; //n을 엄청 큰 양수로 만들기
		n = n % 10; //n은 얼마가 될지모르는데 5696이라고 가정했을 때 n%10을 하면 나머지 값은 6임
		System.out.println(n);
	}
}