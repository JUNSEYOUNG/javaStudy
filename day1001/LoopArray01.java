/*배열 연습)
1부터 45까지의 숫자 6개를 말해봅시다. 로또추첨
*/


class LoopArray01
{
	public static void main(String[] args) 
	{
		int[] lotto = {4,11,19,26,27,43};      //타입[] 변수 = {, , , ...};
		
		System.out.println("건우가 추천하는 이번주 로또번호");
		System.out.print(lotto[0]+ " ");            //0인덱스 - 4 //+ " " 하면 띄어쓰기됨
		System.out.print(lotto[1]+ " ");            //1인덱스 - 11
		System.out.print(lotto[2]+ " ");            //2인덱스 - 19
		System.out.print(lotto[3]+ " ");            //3인덱스 - 26
		System.out.print(lotto[4]+ " ");            //4인덱스 - 27
		System.out.print(lotto[5]+ " ");            //5인덱스 - 43

	}
}

/*출력결과
건우가 추천하는 이번주 로또번호
4 11 19 26 27 43
*/