//if문 연습) 사용자에게 월을 입력받아 계절명을 출력하는 프로그램 작성
//<처리조건> 
//3,4,5 봄
//6,7,8 여름
//9,10,11 가을
//12,1,2 겨울

import java.util.Scanner;
class IfExam05   
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name="";         //계절이름
		int month;              //월
		System.out.println("월을 입력하세요.");
		month = sc.nextInt();

		if(month>=3 && month<=5){
			name = "봄";
		}else if(month>=6 && month<=8){        //그렇지않고 만약에
			name = "여름";
		}else if(month>=9 && month<=11){
			name = "가을";
		}else if(month==1 || month==2 || month==12){
			name = "겨울";
		}
		System.out.println(month+ "월은" +name+ "입니다.");
	}
}