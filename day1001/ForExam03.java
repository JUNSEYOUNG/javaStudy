//for문 연습) ForExam02관련문제

class ForExam03
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		System.out.println("b");
		int i;                        //int가 for문 밖에있네? i가 for문 밖에서 선언됨
		for(i=1; i<=3; i++){
			System.out.println(i);
		}
            System.out.println("c");
			System.out.println("i:"+i);  
			//int가 for문 밖에서 선언되었으니까 i도 for문 밖에서 출력가능함!
			//반복문 밖에서도 변수 i가 필요하다면(4출력을 원하면!) 지금처럼 반복문이 오기 전에 먼저 변수를 선언해야 함

	}
}

/*출력결과:
a
b
1
2
3
c
i:4
*/