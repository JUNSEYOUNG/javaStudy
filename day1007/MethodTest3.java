//메소드 연습) 정수 두개를 받아서 큰 수를 받아오는 프로그램 작성

class MyUtil
{
	int getMax(int a,int b){         //return값의 자료형 쓰기
		int max=a;    //a라고 가정
		if(b>max){
			max = b;
		}
		return max;                  //max라는 리턴값 있음
	}
}


class MethodTest3
{
	public static void main(String[] args) 
	{
      int age1 = 26;     //사용하는 코드작성
	  int age2 = 28;
	  int result;
	  MyUtil util = new MyUtil();
	  result = util.getMax(age1,age2);           //큰수를 찾아주세요 찾으면 result에 담아주세요
	  System.out.println(result);
	}
}
