//if-else 중첩선택문 연습) 사용자에게 3개의 수를 입력받아 그 중에
//가장 큰 수를 찾아 출력하는 프로그램 작성

import java.util.Scanner;
class IfExam03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, max;
		System.out.println("첫번째 수를 입력하세요.");
		a = sc.nextInt();
		System.out.println("두번째 수를 입력하세요.");
		b = sc.nextInt();
		System.out.println("세번째 수를 입력하세요.");
		c = sc.nextInt();
		
	
		if(a>b){
			if(a>c){               //중첩선택문 옴마헷갈린당
				max=a;
			}else{
				max=c;             //중첩선택문에서 else가 오면 나랑 가장 가까운 if에 대응됨
			}
		}else{
			if(b>c){
				max = b;
			}else{
				max = c;
			}
			}
        System.out.println("가장 큰수는" + max + "입니다.");

}
}
