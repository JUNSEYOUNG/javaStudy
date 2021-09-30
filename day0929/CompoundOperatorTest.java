//복합치환연산자 연습)예제보고 결과 예측해보기

class CompoundOperatorTest 
{
	public static void main(String[] args) 
	{
		int i = 1;
		int sum = 0;

		//아래 sum += i;이 3번이나 반복되니까 반복문 for를 사용해보겠음!
		//for(i=1; i<=3; i++){
		for(i=1; i<=100; i++){
			sum += i;  //sum=sum+i  //sum에 +i해서 for문 빠져나오게 하는건가?
		}


		/*
		sum += i;     //sum=sum+i  //sum=0+1  //결과:1

		i++;          //i=i+1      //i=1+1    //결과:2
		sum += i;     //sum=sum+i  //sum=1+2  //결과:3

		i++;          //i=i+1      //i=2+1    //결과:3
		sum += i;     //sum=sum+i  //sum=3+3  //결과:6
		*/
		
		System.out.println("i:"+i);       //3
		System.out.println("sum:"+sum);   //6
	}
}
