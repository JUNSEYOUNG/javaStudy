//비트연산자 & | ^ 실험(맞바꿀때 임시변수 1개 생성해야한다는 점) 
//<String타입은 무조건 임시변수 1개 생성해야 맞바꿀 수 있음>

class SwapTest    //바꾼다는 뜻 swap
{
	public static void main(String[] args) 
	{
		String cup1 = "커피";
		String cup2 = "녹차";

		System.out.println("컵1:"+cup1);
		System.out.println("컵2:"+cup2);

		//컵1:커피
		//컵2:녹차

		//컵1,2에 있는 음식물을 맞바꾸고 싶네? 어떻게하면 좋을까?
		//빈 컵을 하나 더 만들면되겠다! 
		//컵1에 있는 커피를 빈 컵에 부으면 빈 컵에 커피가 담기겠지?
		//컵2에 있는 녹차를 컵1에 담고
		//빈 컵에 있는 커피를 컵2에 담는거야
		//그럼 빈 컵에는 아무것도 안 남게 되지!
		//아래에서 코딩해보자

		String cup3;  //빈컵 만들기(새로운 임시변수생성)
		cup3 = cup1;
		cup1 = cup2;
		cup2 = cup3;

		System.out.println("두개의 컵의 내용을 서로 바꾸었습니다.");
		System.out.println("컵1:"+cup1);
		System.out.println("컵2:"+cup2);

		//컵1:녹차
		//컵2:커피

	}
}
