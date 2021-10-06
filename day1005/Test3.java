//pdf 선택문과 반복문 연습) programming 14번

/*구구단표를 화면에 출력하는 프로그램을 작성하여 보자. 
2단에서 시작하여 9단까지를 출력한다. 중첩된 반복문을 사용하라.
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
		for(int dan=2; dan<10; dan++){         //2단부터 9단까지   //8번반복
			System.out.println("***"+dan+"단***");

			for(int i=1; i<10; i++){          //1부터 9까지      //9번반복
				System.out.println(dan + "*" +i+ "=" + (dan*i));     //72번반복
			}//end for i
					System.out.println();    //단마다 띄어쓰기하려고!
		}//end for dan
	}//end main
}//end class
