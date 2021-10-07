//메소드) 구구단을 출력하는 메소드 만들어보기
class MyUtil
{
	void gugudan(int dan){
		System.out.printf("***%d단***\n",dan);
		for(int i=1; i<=9; i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		return;     //내가 안 적어도 생략되어 있음
	}
}




class MethodTest1 
{
	public static void main(String[] args) 
	{
		MyUtil mu = new MyUtil();          //객체생성
		mu.gugudan(9);
		System.out.println("==================");
		mu.gugudan(10);
	}
}
