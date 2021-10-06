//do while연습) 2단부터 9단까지 출력

class DoWhileExam4 
{
	public static void main(String[] args) 
	{
		int dan,i;
		dan = 2;
		do{
			System.out.printf("*** %d단 ***\n",dan);
			i=1;
			do{
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
				i++;
			}while(i<=9);
			System.out.println();
			dan++;
		}while(dan<=9);
	}
}



/*
[do while문의 형식]

초기값;
do{
   반복 수행할 명령어들;
   증감식;
}while(조건식);
*/
