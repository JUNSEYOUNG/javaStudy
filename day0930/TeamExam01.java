/*조별과제) switch문 안에 if문 넣어야함!
사용자에게 생월과 생일을 입력받아
별자리를 판별하여 출력하는 프로그램 작성

이름 > 윤태인
생월 > 2
생일 > 9
윤태인님의 별자리는 물병자리입니다
*/

import java.util.Scanner;
class TeamExam01 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name;
		System.out.println("이름을 입력하세요.");
		name = sc.next();
		int month, day;
		System.out.println("생월을 입력하세요.");
		month = sc.nextInt();
		System.out.println("생일을 입력하세요.");
		day = sc.nextInt();
		if(month<1 || month>12 || day<1 || day>31){
			System.out.println("잘못된 입력값입니다.");}
			else{
		switch(month){
			case 1: if(day<=19) {System.out.println("염소자리입니다.");break;
			case 2:System.out.println("2");break;
			case 3:System.out.println("3");break;
			case 4:System.out.println("4");break;
			case 5:System.out.println("5");break;
			case 6:System.out.println("6");break;
			case 7:System.out.println("7");break;
			case 8:System.out.println("8");break;
			case 9:System.out.println("9");break;
			case 10:System.out.println("10");break;
			case 11:System.out.println("11");break;
			case 12:System.out.println("12");break;
		}

            switch(day){
			case 1:System.out.println("1");break;
			case 2:System.out.println("2");break;
			case 3:System.out.println("3");break;
			case 4:System.out.println("4");break;
			case 5:System.out.println("5");break;
			case 6:System.out.println("6");break;
			case 7:System.out.println("7");break;
			case 8:System.out.println("8");break;
			case 9:System.out.println("9");break;
			}
			System.out.println(name+"님의 별자리는" + "물병자리 입니다.");
	}
}



<<숙제>>
	별자리 프로그램 수정해보기
	오늘 학습내용 요약정리
    pdf에 선택문과 반복문 > 1번을 문장으로 표현해보기
	프로그래밍 6번 작성해보기


