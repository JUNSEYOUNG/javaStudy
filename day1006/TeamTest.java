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
		String name, result="";
		int month, day;
		int[] last = {31,28,31,30,31,30,31,31,30,31,30,31};       //매달 마지막 일자
		char again; 


			do{
			System.out.print("이름을 입력하세요 ==>");
			name = sc.next();

			do{
				System.out.print("생월을 입력하세요 ==>");
				month = sc.nextInt();
			}while(month < 1 || month > 12);   //잘못입력했을 동안 do while문 무한반복

			do{ 
				System.out.print("생일을 입력하세요 ==>");
				day = sc.nextInt();
			}while(day < 1 || day > last[month-1]);  //-1하는 이유: 1월이면 31일이라 인덱스0, 2월이면 28일이라 인덱스1, 3월이면 31일이라 인덱스2

				
					switch(month){   
						case 1: if(day<=19) result = "염소"; else result = "물병"; break;
						case 2: if(day<=18) result = "물병"; else result = "물고기"; break;
						case 3: if(day<=20) result = "물고기"; else result = "양"; break;
						case 4: if(day<=19) result = "양"; else result = "황소"; break;
						case 5: if(day<=20) result = "황소"; else result = "쌍둥이"; break;
						case 6: if(day<=21) result = "쌍둥이"; else result = "게"; break;
						case 7: if(day<=22) result = "게"; else result = "사자"; break;
						case 8: if(day<=22) result = "사자"; else result = "처녀"; break;
						case 9: if(day<=23) result = "처녀"; else result = "천칭"; break;
						case 10: if(day<=22) result = "천칭"; else result = "전갈"; break;
						case 11: if(day<=22) result = "전갈"; else result = "사수"; break;
						case 12: if(day<=24) result = "사수"; else result = "염소"; break;
					}
					System.out.printf("%s님의 별자리는 %s자리입니다.\n",name,result);
					
					

					do{
					System.out.print("또 하시겠어요?(y/n)");
					again = sc.next().charAt(0);             //y나 n이라는 문자를 읽어들여야 하니까 charAt(0) 쓰나?
					}while(again != 'y' && again != 'n' && again != 'Y' && again != 'N'); 


					}while(again == 'y' || again == 'Y');    //y일 때 다시 처음부터 실행

					System.out.println("종료합니다.");

				}
			}
