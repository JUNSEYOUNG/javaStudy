//pdf ���ù��� �ݺ��� ����) programming 14��

/*������ǥ�� ȭ�鿡 ����ϴ� ���α׷��� �ۼ��Ͽ� ����. 
2�ܿ��� �����Ͽ� 9�ܱ����� ����Ѵ�. ��ø�� �ݺ����� ����϶�.
2*1=2
2*2=4
2*3=6
...
9*8=72
9*9=81
*/
class Test3 
{
	public static void main(String[] args) 
	{
		for(int dan=2; dan<10; dan++){         //2�ܺ��� 9�ܱ���   //8���ݺ�
			System.out.println("***"+dan+"��***");

			for(int i=1; i<10; i++){          //1���� 9����      //9���ݺ�
				System.out.println(dan + "*" +i+ "=" + (dan*i));     //72���ݺ�
			}//end for i
					System.out.println();    //�ܸ��� �����Ϸ���!
		}//end for dan
	}//end main
}//end class
