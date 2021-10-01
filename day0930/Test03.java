/*개별과제3) 사용자에게 생월과 생일을 입력받아 별자리를 판별하여 출력하는 프로그램 작성,수정

이름 ==> ooo
생월 ==> o
생일 ==> o
ooo님의 별자리는 oo자리입니다
*/

import java.util.Scanner;
class Test03 
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

		if(month<1 || month>12 || day<1 || day>31){  //잘못된 입력값 만들어주기
			System.out.println("잘못된 입력값입니다.");}
			else{
				switch(month){    //switch case:출력결과()문, if문(연산자) 사용  
					case 1: if(day<=19){System.out.println(name +"님의 별자리는 염소자리입니다.");}
					else {System.out.println(name+"님의 별자리는 물병자리입니다.");}
						break;
					case 2: if(day<=18){System.out.println(name+"님의 별자리는 물병자리입니다");}
					else {System.out.println(name+"님의 별자리는 물고기자리입니다.");}
						break;
					case 3: if(day<=20){System.out.println(name+"님의 별자리는 물고기자리입니다.");}
					else {System.out.println(name+"님의 별자리는 양자리입니다.");}
						break;
					case 4: if(day<=19){System.out.println(name+"님의 별자리는 양자리입니다.");}
					else {System.out.println(name+"님의 별자리는 황소자리입니다.");}
						break;
					case 5: if(day<=20){System.out.println(name+"님의 별자리는 황소자리입니다.");}
					else {System.out.println(name+"님의 별자리는 쌍둥이자리입니다.");}
						break;
					case 6: if(day<=21){System.out.println(name+"님의 별자리는 쌍둥이자리입니다.");}
					else {System.out.println(name+"님의 별자리는 게자리입니다.");}
						break;
					case 7: if(day<=22){System.out.println(name+"님의 별자리는 게자리입니다.");}
					else {System.out.println(name+"님의 별자리는 사자자리입니다.");}
						break;
					case 8: if(day<=22){System.out.println(name+"님의 별자리는 사자자리입니다.");}
					else {System.out.println(name+"님의 별자리는 처녀자리입니다.");}
						break;
					case 9: if(day<=23){System.out.println(name+"님의 별자리는 처녀자리입니다.");}
					else {System.out.println(name+"님의 별자리는 천칭자리입니다.");}
						break;
					case 10: if(day<=22){System.out.println(name+"님의 별자리는 천칭자리입니다.");}
					else {System.out.println(name+"님의 별자리는 전갈자리입니다.");}
						break;
					case 11: if(day<=22){System.out.println(name+"님의 별자리는 전갈자리입니다.");}
					else {System.out.println(name+"님의 별자리는 사수자리입니다.");}
						break;
					case 12: if(day<=24){System.out.println(name+"님의 별자리는 사수자리입니다.");}
					else {System.out.println(name+"님의 별자리는 염소자리입니다.");}
						break;
		
				}
			}
	}
	}

