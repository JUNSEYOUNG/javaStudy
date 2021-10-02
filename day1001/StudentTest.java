//ArrayTest와 관련된 배열문제)
//아까 5명의 이름이랑 나이 같이 출력하기

class StudentTest
{
	public static void main(String[] args) 
	{
		String []name = {"임하연","김수연","정자영","윤서우","박성미"};
		int []age = {27,28,26,29,28};
		
		int tot = 0;   //평균나이계산
		for(int i=0; i<name.length; i++){
			System.out.println(name[i] + ":" + age[i]);
            tot += age[i];       //반복문 빠져나가기 전에 전체나이의 합 구하기
		}
		double avg = (double) tot / age.length;
		System.out.println("평균나이:" + avg);
	}
}
