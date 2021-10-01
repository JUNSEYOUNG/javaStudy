//문자열 연결 실험

class StringTest 
{
	public static void main(String[] args) 
	{
		String data = "";             //String 변수 선언 시 ""으로 초기값 주기
		data = "아메리카노";
		data = data + ",콜라";         //data에 아메리카노랑 콜라 담김
		data = data + ",맥주";       
		System.out.println(data);     //아메리카노,콜라,맥주 담김
		
	}
}
