/*개별과제) 12개월 동안의 카드 사용 금액을 double형의 배열에 저장하는 
클래스 credit-card를 설계하라. 사용자로부터 월별 사용 금액을 입력받을 때는 음수를 체크하도록 하라.
1. 1년 동안의 전체 사용 금액
2. 월별 평균 사용 금액
3. 가장 지출이 많았던 월
4. 가장 지출이 적었던 월
*/

import java.util.Scanner;
class CreditCard
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		double[] pay = new double[12];
		double total = 0;
		double avg;
		for(int i=0; i<pay.length; i++){


			do{
			System.out.printf("%d월의 카드 사용금액을 입력하세요 ==> ",i+1);   //i가 0부터 시작하니까 1월꺼 구하려면 i+1해야되서인가?
			pay[i] = sc.nextDouble();

			}while(pay[i] < 0);       //음수면 계속 동작하도록!(음수는 잘못 입력된거임)
			total += pay[i];          //전체사용금액
		}

		avg = total/pay.length;         //평균사용금액

		double max = pay[0];
		double min = pay[0];
		int max_month = 0;
		int min_month = 0;
		
		for(int i=0; i<pay.length; i++){        //최대값, 최대값이 있는 인덱스도 필요
			if(pay[i] > max){
				max = pay[i];
				max_month = i;
			}
			if(pay[i] < min){                   //최소값, 최소값이 있는 인덱스도 필요
				min = pay[i];
				min_month = i;
			}
		}
		System.out.printf("1년 동안의 전체 사용금액: %.1f\n",total);
		System.out.printf("월별 평균 사용금액: %.1f\n",avg);
		System.out.printf("가장 지출이 많았던 월: %d\n",max_month+1);  //+1하는 이유: 위에서 인덱스로 되어있어서?
		System.out.printf("가장 지출이 적었던 월: %d\n",min_month+1);
	}
}
