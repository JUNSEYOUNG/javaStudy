//break문
class BreakTest 
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		System.out.println("b");
		for(int i=1; i<=10; i++){    //1~10까지 반복
			System.out.println(i);
			if(i%3 == 0){
				break;              //3의 배수일때는 hello 안 만나고 반복문 아예 빠져나감
			}
			System.out.println("hello");
		}
		System.out.println("c");
		System.out.println("d");
		}
	}

	/*
	출력결과
	a
	b
	1
	hello
	2
	hello
	3
	c
	d
	*/
