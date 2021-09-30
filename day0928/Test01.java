//사용자로부터 문자열을 받아서 맨 첫번째에 있는 문자 출력하기(Char 자료형)

import java.util.Scanner;
class Test01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String data;
		System.out.println("문자열을 입력하세요.");
		data = sc.next();

		//char first;
		//first = data.charAt(0);
		//charAt은 String의 위치(index)에 있는 문자 하나를 알려주는 기능
		char frist = data.charAt(0);
		System.out.println("맨 첫번째에 있는 문자는" + first + "입니다.");
		//System.out.println("맨 첫번째에 있는 문자는" + data.charAt(0) + "입니다.");

		//String first = data.charAt(0)+""; //String으로 만들기 위해서 +"" 붙이면 됨
		//System.out.println("맨 첫번째에 있는 문자는" + first + "입니다.");
	}
}
