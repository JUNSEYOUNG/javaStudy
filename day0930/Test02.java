/*개별과제2) 프로그래밍 6번 작성하기
사용자로부터 키를 입력받아서 표준 체중을 계산한 후에 사용자의 체중과 비교하여
저체중인지, 표준인지, 과체중인지를 판단하는 프로그램을 작성                  
표준 체준 계산식은 다음을 사용
<표준체중 = (키-100)*0.9>
*/

import java.util.Scanner;
class Test02
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double g;                                  //평균몸무게
		int k, w;                                  //사용자의 키,몸무게
		System.out.println("사용자의 키를 입력하세요.");
		k = sc.nextInt();
		System.out.println("사용자의 몸무게를 입력하세요.");
		w = sc.nextInt();
		g = (k-100)*0.9;

		if(w<g){                                   //사용자의 몸무게<평균 몸무게
			System.out.println("저체중입니다.");
      	}else if(w>g){
			System.out.println("과체중입니다.");
		}else{
			System.out.println("표준체중입니다.");	
		}

	}
}

