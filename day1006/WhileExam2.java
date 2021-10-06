//while문 연습)구구단 출력


class WhileExam2 
{
	public static void main(String[] args) 
	{
		int dan = 2;
		while(dan<=9){
			System.out.printf("***%d단***\n",dan);      //형식지정
			int i=1;            //초기값
			while(i<=9){        //조건식
				System.out.printf("%d*%d=%d\n",dan,i,dan*i);
				i++;            //증감식
			}
			dan++;
			System.out.println();
		}
	}
}
