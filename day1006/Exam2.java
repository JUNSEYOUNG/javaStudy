/*사용자에게 문자열을 입력받아서 입력한 문자열의 모음의 수를 구하여
출력하는 프로그램 작성*/

import java.util.Scanner;
class Exam2
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String data;  
		int cnt=0; //모음의 개수 알려고 변수선언
		char c;  //한 문자씩 찝어오려고 변수선언
		System.out.print("문자열을 입력하세요.==>");
		data = sc.next();

		for(int i=0; i<data.length(); i++){ 
			c = data.charAt(i);
			switch(c){
				case'a':case'A':case'e':case'E':case'i':case'I':case'o':case'O':case'u':case'U':
					cnt++;
			}
		}//end for
			System.out.println("모음의 수는 " + cnt + "개입니다.");
			System.out.printf("모음의 수는 %d개입니다.",cnt);
	}
}
