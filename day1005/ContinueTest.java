//continue��
class ContinueTest 
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		System.out.println("b");
		for(int i=1; i<=10; i++){
			System.out.println(i);
			if(i%3 == 0){
				continue;            //3�� ����϶��� hello �� ������ ���� ���ǽ����� �Ѿ
			}
			System.out.println("hello");
		}
		System.out.println("c");
		System.out.println("d");
		}
	}

	/*
    ��°��
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
