/*팀별 연습문제) 사용자로 부터 이름,생월,생일을 입력받아 별자리를 판별하여 
출력하는 프로그램을 작성합니다. 만약 입력값이 잘못되면 제대로 된 값을 
입력받을 동안 반복 실행하게 합니다.

<실행 예>
이름을 입력하세요==>홍길동
생월을 입력하세요==>-2
생월을 입력하세요==>100
생월을 입력하세요==>2
생일을 입력하세요==>30
생일을 입력하세요==>15
홍길동 님의 별자리는 __자리입니다.
또하시겠어요?(y/n) ==> k
또하시겠어요?(y/n) ==> y
이름을 입력하세요==> 이순신
생월을 입력하세요==>9
생일을 입력하세요==>20
이순님의 별자리는 __자리입니다.
또하시겠어요?(y/n)==>n
종료하였습니다.
*/

import java.util.Scanner;
class TeamTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String name, data=" ";
		System.out.println("이름을 입력하세요.");
		name = sc.next();

		int month, day;
		int n, y;

		do{
			System.out.print("생월을 입력하세요.==>");
			month = sc.nextInt();
		}while(month <1 || month >12);

		do{
			System.out.print("생일을 입력하세요.==>");
			day = sc.nextInt();
		}while(day<1 || day>31);


			
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
				while(true){
					System.out.print("또 하시겠어요?(y/n)==>");
					data = sc.next();
					if(data != "y" && data == "n"){
						break;
				}
				System.out.println("종료하였습니다.");
				}
			}
	}
