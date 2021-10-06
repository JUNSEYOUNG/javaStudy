//과제, 발표 랜덤제비뽑기 코딩

import java.util.Random;
class StudentRandom 
{
	public static void main(String[] args) 
	{
		String[] names= {"김수연","김시아","김지현","노유나","박성미","박지예","유하림",
			"윤서우","윤태인","이건우","임상진","임하연","전세영","정자영","최현호"};

		for(int i=0; i<100; i++){                              //0인덱스~99인덱스까지 > 1~100까지
			System.out.print(names[i%names.length]+"\b\b\b");  //줄이 안 바뀜, 그자리에 랜덤으로 돌아감
			try{
				Thread.sleep(100);      //스레드가 작동해서 랜덤으로 돌아감
			}catch(Exception e){}
		}

		Random rand = new Random();     //난수 사용가능해짐
		int n = rand.nextInt();
		n = n >>> 1;                    //엄청 큰 난수 발생하니까 범위규제 필요
		n = n%15;                       //0~14까지 난수발생 , n번째가 당첨자가 됨
		System.out.println("***당첨자***");
		System.out.println(names[n]);


	}
}
