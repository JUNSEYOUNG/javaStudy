/*팀별 연습문제) 5명 학생의 이름과 점수를 입력받아 
성적이 높은순으로 정렬하여 출력하는 프로그램을 작성하시오.(내림차순 정렬)

< 실행 예 >
1번째 학생의 이름 ==> 홍길동
1번째 학생의 점수 ==> 50
2번째 학생의 이름 ==> 이순신
2번째 학생의 점수 ==> 100
3번째 학생의 이름 ==> 유관순
3번째 학생의 점수 ==> 80
4번째 학생의 이름 ==> 김유신
4번째 학생의 점수 ==> 60
5번째 학생의 이름 ==> 문재인
5번째 학생의 점수 ==> 70


** 성적순 정렬 **
이순신	100
유관순	80
문재인	70
김유신	60
홍길동	50
*/

import java.util.Scanner;
class TeamTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];
		int[] score = new int[5];

		for(int i=0; i<name.length; i++){
			System.out.print(i+1 + "번째 학생의 이름==>");  //1번째
			name[i] = sc.next();
			System.out.print(i+1 + "번째 학생의 점수==>");  //1번째
			score[i] = sc.nextInt();
		}

        for(int i=0; i<score.length; i++){
			for(int j=i+1; j<score.length; j++){       //비교하는 수 j
				if(score[j] > score[i]){               //j가 앞으로 와야되고 i랑 자리를 바꿔야되는거지?
					int temp = score[i];
					score[i] = score[j];               //맞바꾸기
					score[j] = temp;

					String temp2 = name[i];
					name[i] = name[j];
					name[j] = temp2;
			}
				
				}
				
			}
		System.out.println("***성적순(내림차순) 정렬 결과***");
			for(int i=0; i<score.length; i++){
				System.out.println(name[i] + " " + score[i]);
		}
	}
}
