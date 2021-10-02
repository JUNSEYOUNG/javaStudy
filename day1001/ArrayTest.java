//배열 연습) 5명의 사람들의 평균나이를 계산하여 출력하는 프로그램 작성


class ArrayTest
{
	public static void main(String[] args) 
	{

		int []age = {27,28,26,29,28};
		int sum = 0;             //나이를 다 더해야하니까!
		for(int i=0; i<age.length; i++){
			sum += age[i];             //sum = sum + age[i]; 같은표현임
	}

	double avg = (double)sum / age.length;     //평균구하기(실수값으로)
	System.out.println("평균나이:" + avg);
	
}
}

//결과출력: 평균나이27.6