//연습)사용자한테 문자열을 입력받아 입력한 문자열에 
//소문자 'o'의 수를 파악하여 출력하는 프로그램 작성

import java.util.Scanner;
class Test02
	{ 
   public static void main(String[] args)
	   {
	   Scanner sc = new Scanner(System.in);

	   String str;
	   System.out.println("문자열을 입력하세요.");
	   str = sc.next();

	   int cnt = 0;
	   char ch;

	   for(int i=0; i<str.length(); i=i+1){
		ch = str.charAt(i);
		if(ch == 'o')
		cnt = cnt+1;
	   }
	   System.out.println("소문자 o의 개수는" + cnt + "개 입니다.");
	}
}
