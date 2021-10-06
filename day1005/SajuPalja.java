//사주팔자 프로그램(완성) 이름,생년,생월,생일,시간 받기

import java.util.Scanner;
class SajuPalja
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] result = {"천귀","천액","천권","천파","천인","천문","천복","천고","천역",
			"천간","천수","천명"};

		String name;
		int year;
		int month;
		int date;
		int time;

		System.out.print("이름을 입력하세요.==>");
		name = sc.next();
		System.out.println("띠를 입력하세요.==>");
		System.out.print("0:쥐,1:소,2:범,3:토끼,4:용,5:뱀,6:말,7:양,8:원숭이,9:닭,10:개,11:돼지 ==>");
		year = sc.nextInt();    //1(소띠라서 1입력) /천액
		System.out.print("생월을 입력하세요==>");
		month = sc.nextInt();  //3월이라고 가정 /천파
		System.out.print("생일을 입력하세요.==>");
		date = sc.nextInt();   //20일이라고 가정 /천수
		System.out.println("생시를 입력하세요.");
		System.out.print("0:자,1:축,2:인,3:묘,4:진,5:사,6:오,7:미,8:신,9:유,10:술,11:해==>");
		time = sc.nextInt();   //8(신시라서 8입력) /천복

		int n = year;   //n이 1
		System.out.println("***"+name+"님의 사주팔자 풀이***");
		System.out.println("생년의 운명은" + result[n]);        //천액
		n = (n + month -1)%12;                              //1+3=4 -1=3%12 =3
		System.out.println("생월의 운명은" + result[n]);        //천파
		n = (n + date -1)%12;                               //3+20=23 -1=22%12 =10
		System.out.println("생일의 운명은" + result[n]);        //천수
		n = (n + time)%12;                                  //10+8=18 %12=6  
		System.out.println("생시의 운명은" + result[n]);        //result의 6번째: 천복
	}
}