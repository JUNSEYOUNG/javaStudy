/*선택문과 반복문) 1부터 100까지 3씩 건너뛰면서 정수의 값을 출력하는 프로그램을
다음의 반복 구조를 사용해 작성하라
- for루프
*/

class Test06 
{
	public static void main(String[] args) 
	{
		for(int i=1; i<=100; i++){
			if(i%3==0){                
				System.out.print(i+" ");
			}
		}
	}
}
