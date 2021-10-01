//if문 연습) 사용자에게 월을 입력받아 계절명을 출력하는 프로그램 작성          if문은 논리연산자, 비교연산자랑 같이 자주쓰여!
//<처리조건> 
//3,4,5 봄
//6,7,8 여름
//9,10,11 가을
//12,1,2 겨울
/*다음과 같이 입력했을때 "잘못된 입력입니다."라고 출력하도록 프로그램 수정
월을 입력하세요 > 100
100월은 잘못된입력입니다.
*/

import java.util.Scanner;
class IfExam0502   
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name="";         //계절이름
		int month;              //월
		System.out.println("월을 입력하세요.");
		month = sc.nextInt();

		if(month < 1 || month > 12){                 //바람직하지 않게 만들기 month가 1보다 작고 month가 12보다 커야함
			System.out.println("잘못된 입력입니다.");

		}else if(month>=3 && month<=5){
			name = "봄";
		}else if(month>=6 && month<=8){        //그렇지않고 만약에
			name = "여름";
		}else if(month>=9 && month<=11){
			name = "가을";
		}else if(month==1 || month==2 || month==12){        //1,2,12는 연달아 이어지는 숫자가 아니라서 이렇게 표현!
			name = "겨울";
		}
		System.out.println(month+ "월은" +name+ "입니다.");
	}
}