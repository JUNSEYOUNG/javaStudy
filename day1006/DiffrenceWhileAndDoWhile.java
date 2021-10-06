//while문과 do while문의 차이점


class DiffrenceWhileAndDoWhile 
{
	public static void main(String[] args) 
	{
		/*int i=100;

		while(i<=3){
			System.out.println("hello");
			i++;
		}
	}
}
*/

//while문 결과: 조건식이 만족하지 않아서 실행 자체가 안됨 > 아무것도 출력안됨

		int i=100;

		do{
			System.out.println("hello");
			i++;
		}while(i<=3);
	}
}
//do while문 결과: 조건식을 나중에 판별하므로 일단 실행은 함 > 출력은 됨 > hello