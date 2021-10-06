//continue문
class ContinueTest 
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		System.out.println("b");
		for(int i=1; i<=10; i++){
			System.out.println(i);
			if(i%3 == 0){
				continue;            //3의 배수일때는 hello 안 만나고 다음 조건식으로 넘어감
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
	4
	hello
	5
	hello
	6
	7
	hello
	8
	hello
	9
	10
	hello
	c
	d
	*/
