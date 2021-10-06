////do while문 연습)1부터 10까지 모든 수를 do while문을 이용해 출력

class DoWhileExam1
{
	public static void main(String[] args) 
	{
		int i=1;
		do{
			System.out.println(i);
			i++;
		}while(i<=10);
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