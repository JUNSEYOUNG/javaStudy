/*선택문과 반복문) 사용자로부터 3개의 정수를 읽어들인 후 
if-else문을 사용하여 가장 작은 값을 결정하는 프로그램 작성
*/

import java.util.Scanner;
class Test05 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int a, b, c, min;
		System.out.println("첫번째 정수를 입력하세요.");
		a = sc.nextInt();
		System.out.println("두번째 정수를 입력하세요.");
		b = sc.nextInt();
		System.out.println("세번째 정수를 입력하세요.");
		c = sc.nextInt();
		
		/*if(a<b){
			if(a<c){
				System.out.println("가장 작은 값: " +a+ "입니다."); //min = a;
			}else{
				System.out.println("가장 작은 값: " +c+ "입니다."); //min = c;
			}
		}else{       //a>b
			if(b<c){
				System.out.println("가장 작은 값: " +b+ "입니다."); //min = b;
			}else{
				System.out.println("가장 작은 값: " +c+ "입니다."); //min = c;
		
		}
}
}
}
*/

		if(a<b && a<c){
			min = a;
		}else if(b<a && b<c){
			min = b;
		}else{
			min = c;
		}
		System.out.println("가장 작은 수는 " +min+ "입니다.");
	}
}
