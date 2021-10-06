/*선택문과 반복문) 2와 100사이에 있는 모든 소수(prime number)를 찾는 프로그램 작성
주어진 정수 k를 2부터 k-1까지의 숫자로 나누어서 나머지가 0인 것이 
하나라도 있으면 소수가 아니다
*/

class Test08 
{
	public static void main(String[] args) 
	{
		for(int i=2; i<=100; i++){          //2~100이라는 수가 소수인지 확인하려면 중첩반복문이 필요함
			int cnt = 0;
			for(int k=2; k<i; k++){        //i가 소수인지 판별
				if(i%k==0){                //k가 i의 약수인가요?
					cnt++;                  //소수가 아닐경우
				} 

			}
				if(cnt==0)                //cnt가 0을 유지하고 있으면 그 수는 소수임
					System.out.print(i + " ");
			}
		}
	}