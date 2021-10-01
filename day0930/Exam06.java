/*if문 연습) 사용자에게 월을 입력받아 그 월의 마지막 날짜를 출력하는 프로그램 작성
<처리조건>
31일  1,3,5,7,8,10,12월
30일  4,6,9,11월
28일  2월

월을 입력하세요 > 9
9월은 31일까지 있어요!
*/

import java.util.Scanner;
class Exam06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month;
		System.out.println("월을 입력하세요.");
		month = sc.nextInt();

		if(month<1 || month>12){                        //1보다 작고 12보다 클수가없지? 1~12월까지니까!
			System.out.println("입력값이 잘못되었습니다.");
			}else if(month==2){
				last = 28;
			}else if(month==4 && month==6 && month==9 && month==11){   //그렇지않고 만약에
				last = 30;
		}
		System.out.println(month + "월은" + last + "일까지 있어요.");

	}
  }