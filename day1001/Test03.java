/*선택문과 반복문) 사용자에게 하나의 문자를 입력받아서 
문자가 'R'이면 사각형의 면적을 계산하고
'T'이면 삼각형의 면적을, 'C'이면 원의 면적을 계산한다
면적을 계산하는데 필요한 숫자들은 사용자로부터 입력받는다
*/

import java.util.Scanner;
class Test03 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String n = "";
		System.out.println("문자 하나를 입력하세요. R/T/C");
		n = sc.next();
		double w,h;
		System.out.println("가로 길이를 입력하세요.");
		w = sc.nextDouble();
		System.out.println("세로 길이를 입력하세요.");
		h = sc.nextDouble();

		if(n.equals ("R")){
		System.out.println("사각형의 면적: " + (w*h));
		}else if(n.equals ("T")){
			System.out.println("삼각형의 면적: " + (w*h)/2);
		}else if(n.equals ("C")){
			System.out.println("원의 면적: " + (w*h)*3.14);
	}
}
}
