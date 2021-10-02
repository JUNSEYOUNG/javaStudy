/*반복문을 이용해 배열의 요소를 모두 출력하는 연습)
LoopArray01과 관련!
//배열의 길이 알려주는 속성 .length
*/

class LoopArray02
{
	public static void main(String[] args) 
	{
		int[]lotto = {4,11,19,26,27,43};
		
		for(int i=0; i<=5; i++){               //i<=5 써도되고 i<6 이렇게써도됨
		//for(int i=0; i<lotto.length; i++){   // .length 이용 	                        
			System.out.print(lotto[i]+ " ");
		}

	}
}
