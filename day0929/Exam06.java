//논리연산자 && || 연습) 
//상품명,단가,구매수량을 입력받아 구매금액을 계산하고
//고객이 지급해야 하는 금액을 출력하는 프로그램 작성
//구매수량이 10개 이상이거나 구매금액이 20000원 이상이면        "~이거나 니까 논리합(||)사용하라는 거네?"
//구매금액의 10%를 할인하려고 함

import java.util.Scanner;
class Exam06 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String item;                          //상품명
		System.out.println("상품명을 입력하세요.");
		item = sc.next();

		int price, qty, total;                //단가,구매수량,구매금액
		System.out.println("단가를 입력하세요.");
        price = sc.nextInt();
		System.out.println("구매수량을 입력하세요.");
        qty = sc.nextInt();
		total = price * qty;                  //단가*구매수량 = 구매금액 

        System.out.println("***결과출력***");
		System.out.println("상품명:" + item);
		System.out.println("단가:" + price);
		System.out.println("구매수량:" + qty);
		System.out.println("총금액(구매금액):" + total);
		

		if(qty >= 10 || total >= 20000)
			System.out.println("지불금액은 10% 할인하여" + (total * 0.9) + "원 입니다."); //total*0.9하면 지급해야 할 금액출력됨
		else
			System.out.println("지불금액은" + total + "원 입니다.");
	}
}
