/*선택문과 반복문) 2와 100사이에 있는 모든 소수(prime number)를 찾는 프로그램 작성
주어진 정수 k를 2부터 k-1까지의 숫자로 나누어서 나머지가 0인 것이 
하나라도 있으면 소수가 아니다
*/

class Test08 
{
	public static void main(String[] args) 
	{
		for(int i=2; i<=100; i++){
			int k = 0;
			for(int j=2; j<=i-1; j++){
				if(i%j==0){
					k++;       //소수가 아닐경우
				} 
				if(k==0)
					System.out.print(i + " ");
			}
		}
	}
}
