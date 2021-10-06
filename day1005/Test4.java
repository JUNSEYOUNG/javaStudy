/*pdf 선택문과 반복문 연습) lab의 1번
성적을 입력받아서 60점 이상이면 합격, 60점 미만이면 불합격이라고 출력하는 프로그램
*/

import java.util.Scanner;
class Test4 
{
	public static void main(String[] args) 
	{
		Scanner input = new Scanner(System.in);
		int score;
		System.out.print("성적을 입력하세요.==>");   //format 변수의내용을 형식지정해서 출력하고 싶을 때 사용(%s,%f,%d)
		score = input.nextInt();
		//System.out.println((score>=60)?"합격":"불합격");  //조건연산자(삼항) 사용

		/*if(score>=60){                       //명령어가 2개이상이면 {}해야되고, 1개면 해도되고 안해도됨!
			System.out.println("합격!");
			System.out.println("축하합니다!");
		}else
			System.out.println("불합격!");
		System.out.println("종료"); */           //else문과 상관없이 출력됨(위 else문은 1개라서 {}안한거니까!)

		if(score<50){
			System.out.println("불합격입니다.");
		}else if(score<60){                     //else가 오면 안되는 이유: if가 벌써 아니라는 소리 x
			System.out.println("안타깝게 불합격입니다.");
		}else if(score<70){
			System.out.println("합격입니다.");
		}else if(score<80){
			System.out.println("우수하게 합격입니다.");
		}else{
			System.out.println("아주 우수하게 합격입니다.");
		}
			
		}
	}
	

