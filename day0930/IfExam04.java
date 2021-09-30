//if문 연습)사용자에게 이름과 출생연도를 입력받아 무료암검진 대상자인지 판별하여 
//결과를 출력하는 프로그램을 작성

//<처리조건>
//무료암검진 대상자는 나이가 40세 이상이고, 그 해가 짝수연도라면 짝수연도에 태어난 사람
//그 해가 홀수연도라면 홀수연도에 태어난 사람
//40세 이상이면 암검진 항목은 위암,간암
//50세 이상이면 암검진 항목은 위암,간암,대장암

import java.util.Scanner;
import java.util.Date;    //올해연도 알 수 있는 공식
class IfExam04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		Date today = new Date();
		String name;
		String items = "";
        int userYear,age,thisYear;       //출생연도,나이,올해연도
		thisYear = today.getYear()+1900;     //올해연도 구하는 공식

		System.out.println("사용자의 이름을 입력하세요.");
		name = sc.next();
		System.out.println("사용자의 출생연도를 입력하세요.");
		userYear = sc.nextInt();

		age = thisYear - userYear; //출생연도를 통해 나이를 계산
		System.out.println(name+"님, 올해에" + age + "살입니다.");

		if(age>=40 && thisYear%2 == userYear%2){     //무료암검진 대상자인지 판별
			items = "위암,간암";
			if(age>=50){
				items = items + ",대장암";
			}
			System.out.println(name+"님,"+ thisYear+"년도에 무료암검진 대상자입니다.");
			System.out.println("암검진 항목은" +items+"입니다.");

		}else{
		System.out.println(name+"님, " + thisYear+"년도에 무료암검진 대상자가 아닙니다.");
		}
	}
}
