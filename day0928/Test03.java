//연습) 사용자에게 문자열을 입력받아 문자열의 길이가
//4글자 이상인지 true, flase를 출력하도록 해보기

import java.util.Scanner;
class Test03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String str;
		System.out.println("문자열을 입력하세요.");
		str = sc.next();

		boolean result;
		result = str.length() >= 4;
			System.out.println(result);
	}
}
