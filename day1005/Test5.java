//pdf 선택문과 반복문 연습) lab 2번
/*
switch문에 대해 실습
키보드에서 문자 하나를 읽어서 모음과 비모음을 구분하는 프로그램을 작성
단, 함수를 사용하지 않고 switch문만을 사용해 문자를 구분
*/

//대문자로 모음을 입력한 경우에도 처리할 수 있도록
//'A','I','U','E,'O'에 대한 case문 작성

//비모음을 처리하기 위해 위 5가지 모음 제외한 나머지 문자들을
//default문을 이용해 다음과 같은 메시지 출력하도록 작성
// "입력된 문자는 모음이 아닙니다."

import java.io.IOException;

class Test5
{
	public static void main(String[] args) throws IOException  //예외처리
	{
		
		System.out.print("문자를 입력하세요.");
		char c = (char)System.in.read();     //문자를 읽어라
		switch(c){
			case 'a':case 'e':case 'i':case 'u':case 'o':case 'A':case 'E':case 'I':case 'U':case 'O':
				System.out.printf("입력된 문자%c는 모음입니다.",c);
				break;
			default:
				System.out.println("입력된 문자는 모음이 아닙니다.");
	}
		/*if(c=='a'){
		System.out.printf("입력된 문자%c는 모음입니다.",c);
		}*/
	}
}
