//선택문 연습)사용자에게 월(3,4,5...)을 입력받아 계절명(봄,여름,가을,겨울)을 출력하는 프로그램을 
//switch case문을 이용하여 작성(조건식 넣을 수 없으니까 if문으로 잘못된 입력값 넣도록 조건식 작성함)               //if문은 논리연산자랑 같이 자주 사용됨

import java.util.Scanner;
class Exam01
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name = "";                 //String문 초기값 ""주기(계절명 넣기위해서)
		int month; 
		System.out.println("생월을 입력하세요.");
		month = sc.nextInt();

		//3,4,5 봄 //6,7,8 여름 //9,10,11 가을 //12,1,2 겨울
		//월이 잘못되면 처리하고 그렇지 않으면 switch문 만나도록 코딩!

		if(month<1 || month>12){
			System.out.println("입력값이 잘못되었습니다.");
		}else{

			switch(month) {
				case 3: case 4: case 5: name = "봄"; break; 
				case 6: case 7: case 8: name = "여름"; break;
				case 9: case 10: case 11: name = "가을"; break;
				case 12: case 1: case 2: name = "겨울"; break;
			}
		    System.out.println(month + "월은" + name + "입니다.");
		}

		
		
	}
}
