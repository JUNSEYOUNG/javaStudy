//메소드) 구구단을 출력하는 메소드 만들어보기
class MyUtil
{
	static void gugudan(int dan){
		System.out.printf("***%d단***\n",dan);
		for(int i=1; i<=9; i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		return;     //내가 안 적어도 생략되어 있음
	}
}




class MethodTest2   //객체없이 클래스이름으로 사용(MyUtil에 static이 붙어서!)
{
	public static void main(String[] args) 
	{
		MyUtil.gugudan(9);
		System.out.println("==================");
		MyUtil.gugudan(10);
	}
}
