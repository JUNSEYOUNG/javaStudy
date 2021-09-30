//if-else문 연습)사용자한테 0~9 사이의 정수를 입력받아서
//한글표기식 출력하는 프로그램 작성
//<<실행 예>>
//0~9사이의 수를 입력하시오 ==> 7입력하면 칠 출력


import java.util.Scanner;
class IfExam02 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("0~9사이의 정수를 입력하세요.");
		n = sc.nextInt();

		if(n==0){
          System.out.println("영");
		}else if(n==1){                 //아니면 만약
		  System.out.println("일");
		}else if(n==2){
		  System.out.println("이");
		}else if(n==3){
		  System.out.println("삼");
		}else if(n==4){
		  System.out.println("사");
		}else if(n==5){
		  System.out.println("오");
        }else if(n==6){
		  System.out.println("육");
		}else if(n==7){
		  System.out.println("칠");
		}else if(n==8){
		  System.out.println("팔");
		}else if(n==9){
		  System.out.println("구");
	}

	}
}
