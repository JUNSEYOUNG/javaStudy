/*선택문과 반복문) 상점에서 하나에 100원인 물건을 판매하고 있다고 가정하자
물건을 10개 이상 구입하는 고객에게는 10%를 할인해준다고 하자
사용자가 구입한 물건의 개수를 입력하면 전체 가격이 얼마인지를 계산해주는 프로그램 작성
즉 물건의 개수가 10개 이상이면 10%할인한 가격으로 계산하여야 한다
if-else문을 사용하라
*/

import java.util.Scanner;
class Test04 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		int cnt, total, price = 100;
		System.out.println("100원샵입니다. 10개 이상 구입하시면 10% 할인해드립니다.");
		System.out.print("몇 개 구입하시겠습니까?===> ");
		cnt = sc.nextInt();
		total = price * cnt;

		if(cnt>=10){
			total = (int)(total*0.9);
		}
		System.out.println("전체가격은 " + total + "원입니다.");
	}
}
