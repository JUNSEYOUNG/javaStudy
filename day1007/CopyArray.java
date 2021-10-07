/*배열 - 8번문제) 배열 a를 배열 b로 복사하려는 의도로 작성되었다.
실제 배열이 복사되는가? 만약 올바르지 않다면 올바르게 수정하라.  (복사가 우리가 생각하는 그런 복사랑 개념이 조금 다름)
int[] a = {1,2,3,4,5};
int[] b = new int[5];
b = a; //배열 a를 배열 b로 복사
*/

class CopyArray 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int[] b = new int[5];
		b = a;

		System.out.println("a배열의 요소");
		for(int i:a){
			System.out.printf("%5d",i);
		}
		System.out.println();
		System.out.println("b배열의 요소");
		for(int i:b){
			System.out.printf("%5d",i);
		}




		a[0] = 100;
		System.out.println("--------------------");
		System.out.println("a배열의 요소");
		for(int i:a){
			System.out.printf("%5d",i);
		}
		System.out.println();
		System.out.println("b배열의 요소");
		for(int i:b){
			System.out.printf("%5d",i);
		}

	}
}



/*출력결과:
a배열의 요소
    1    2    3    4    5
b배열의 요소
    1    2    3    4    5--------------------
a배열의 요소
  100    2    3    4    5
b배열의 요소
  100    2    3    4    5

a[0]에 100넣었더니 b[0]도 100이 되었네? 이러면 진짜 복사가 아니다!
a[0]에 100넣어도 b[0]은 1이어야 되!
같이 바뀌면 진짜 복사가 아님
*/

//stack영역,heap영역
