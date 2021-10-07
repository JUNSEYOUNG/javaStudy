//메소드 연습) 정수형 배열을 매개변수로 전달받아 배열의 요소를 모두 출력하는 메소드를 정의해보기

class MyUtil 
{
	void printArray(int[] data){
		for(int i:data){
			System.out.printf("%5d",i);
		}
		System.out.println();
	}
	}

class MethodTest4
{
	public static void main(String[] args)
	{
		int[] a = {10,20,30,40,50};
		int[] b = {60,70,80,90,100};


		MyUtil util = new MyUtil();
		util.printArray(a);
		util.printArray(b);
}
}
