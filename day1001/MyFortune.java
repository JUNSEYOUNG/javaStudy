/*주말과제) 사용자에게 이름,띠,생월,생일,생시를 입력받아
사주팔자를 판별하여 출력하는 프로그램 작성해보기
*/

import java.util.Scanner;
class MyFortune 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);

		String name;
		System.out.println("이름을 입력하세요.");
		name = sc.next();

	    String saju[] = {"자","축","인","묘","진","사","오","미","신","유","술","해"};   //사주
		String animal[] = {"쥐","소","범","토끼","용","뱀","말","양","원숭이","닭","개","돼지"};  //동물
		String time[] = {"밤 11시-1시", "새벽 1시-3시", "새벽 3시-5시", "새벽5-7시", "오전 7-9시", "오전 9-11시", "낮 11-1시", "오후 1-3시", "오후 3-5시", "오후 5-7시", "오후 7-9시", "오후 9-11시"};
		String des[] = {"천귀", "천액", "천권", "천파", "천인", "천문", "천복", "천고", "천역", "천간", "천수", "천명"};   //팔자

		String user[] = new String[4];
		
		int user_animal;  //띠
		int user_bir;     //생월
		int user_day;     //생일
		int user_time;    //생시

		System.out.println("당신의 띠를 입력하세요.");
		for(int i=0; i<12; i++){
			System.out.println("["+i+ "띠 " +animal_12[i]+"]");
		}
		user_animal = sc.nextInt();

		System.out.println("당신의 생월을 입력하세요.");
		user_bir = sc.nextInt();

		System.out.println("당신의 생일을 입력하세요.");
		user_day = sc.nextInt();

		System.out.println("당신의 태어난 시간을 입력하세요.");
		for(int i=0; i<12; i++){
			System.out.println("["+i+ "시 " +time_12[i]+"]");
		}
		user_time = sc.nextInt();

		int value[] = new int[4];

		value[0] = user_animal;
		value[1] = value[0] + user_bir -1;
		value[2] = value[1] + user_day -1;
		value[3] = value[2] + user_time;

		for(int i=0; i<4; i++){
			for(int n=0; n<12; n++){
				if(value[i]%12==n){
					user[i] = des_12[n];
				}
			}
		}
		System.out.println("당신의 사주입니다.");
		for(int i=0; i<4; i++)
			System.out.println("["+user[i]+"]");
	}
}
