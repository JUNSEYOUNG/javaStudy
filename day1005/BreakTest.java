//break��
class BreakTest 
{
	public static void main(String[] args) 
	{
		System.out.println("a");
		System.out.println("b");
		for(int i=1; i<=10; i++){    //1~10���� �ݺ�
			System.out.println(i);
			if(i%3 == 0){
				break;              //3�� ����϶��� hello �� ������ �ݺ��� �ƿ� ��������
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
	c
	d
	*/
