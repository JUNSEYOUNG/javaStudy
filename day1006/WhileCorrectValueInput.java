//월에 따라 계절명 출력하는 프로그램

import java.util.Scanner;
class WhileCorrectValueInput 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int month = -1;
		
		/*
		for(;;){
		System.out.print("월을 입력하세요.==>"); //이 문장을 제대로 된 값(1~12)을 입력할 때까지 반복 실행시킬거야!
		month = sc.nextInt();
		if(month >= 1 && month <=12){
			break;
			}
		}*/

		//위의 반복문 (월을 입력하세요)를 while문으로 표현해보기
		/* 1)
		while(true){                         //계속 참이라서 반복
	    System.out.print("월을 입력하세요.==>");
		month = sc.nextInt();
		if(month>=1 && month <=12){         //제대로 된 값이면 while문 탈출
			break;
			}
		}*/

		/* 2)
		while(month <1 || month >12){
			System.out.print("월을 입력하세요.==>");
			month = sc.nextInt();
			}
		}*/

		//위의 반복문 (월을 입력하세요)를 do while문으로 표현해보기
		do{
			System.out.print("월을 입력하세요.==>");
			month = sc.nextInt();
		}while(month <1 || month >12);

		String name = "";
		if(month >= 3 && month <=5){
			name = "봄";
		}else if(month >= 6 && month <= 8){
			name = "여름";
		}else if(month >= 9 && month <= 11){
			name = "가을";
		}else{
			name = "겨울";
		}
		System.out.printf("%d월은 %s입니다.",month,name);
	}
}
