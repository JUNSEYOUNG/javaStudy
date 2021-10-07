/*프로그래밍9번 문제) 다음 코드는 배열 a와 배열 b의 내용이 일치하는지
알아보기 위해 작성되었다.배열이 올바르게 비교되는가? 만약 올바르지 않다면 올바르게 수정해라
	> 두개의 배열의 요소가 모두 일치하는지 판별하는 프로그램으로 수정해보기

int[] a = {1,2,3,4,5};
int[] b = {6,7,8,9,10};
if(a==b)
	System.out.println("배열의 내용이 일치합니다.");
else
	System.out.println("배열의 내용이 일치하지 않습니다.");


**b가 {1,2,3,4,5};라고 해서 a와 배열의 요소가 일치한다고 볼 수 있니? ㄴㄴ
heap영역에서 참조하는 주소가 달라! 배열의 내용이 일치하지 않는다고 출력됨 > 반복문 돌면서 확인해야함
*/

class Program9 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int[] b = {1,2,3,4,5};

		boolean flag = true;          //지금 12345똑같기 때문에 false를 안만남
		for(int i=0; i<a.length; i++){
			if(a[i] != b[i]){
				flag = false;
				break;
			}
		}

		if(flag){			//참이면 트루, 거짓이면 폴스
			System.out.println("배열의 내용이 일치합니다.");
		}else{
			System.out.println("배열의 내용이 일치하지 않습니다.");
		}

        //두개의 배열의 요소가 모두 일치하는지 판별하려면 반복문을 돌면서 배열의 원소(인덱스)를 비교해야함

	}
}
