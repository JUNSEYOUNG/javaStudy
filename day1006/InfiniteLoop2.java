//초기값,조건식,증감식 없는 for문

class InfiniteLoop2 
{
	public static void main(String[] args) 
	{
		int i=1;
		for(;;){
		System.out.println("Hello");
		if(i>=3){
			break;
		}
		i++;
		}
	}
}

/*실행결과:
Hello
Hello
Hello
*/
