/*팀별과제) 
4지선다형 문항의 답안 10개를 입력받아 답이 옳은지 판별하여
OX를 출력하고 정답수와 틀린답수를 각각 구하여 출력함
(단! 정답은 미리 프로그램에서 초기화함)

<실행 예>
1번답을 입력하세요==> 1
2번답을 입력하세요==> 4
3번답을 입력하세요==> 2
...
10번답을 입력하세요==>2

1   O
2   X
3   O
...
10  O

정답수:8개
틀린수:2개
*/
//배열문제

import java.util.Scanner;
class TeamTest
{
	public static void main(String[] args) 
	{
		int []quiz = {3,1,3,4,1,2,4,2,3,3};
		Scanner sc = new Scanner(System.in);
		int []answer = new int[10];
		int cnt_o = 0, cnt_x = 0;
		for(int i=0; i<quiz.length; i++){      //배열은 무조건 i가 0부터!
			System.out.print((i+1)+ "번 답을 입력하세요.==>");
			answer[1] = sc.nextInt();
		}
		System.out.println();
		System.out.println("***시험결과***");

		for(int i=0; i<quiz.length; i++){
			if(quiz[i]==answer[i]){
				System.out.println((i+1)+ "  o");
				cnt_o++;
			}else{
			    System.out.println((i+1)+ "  x");
				cnt_x++;
			}
		}

		System.out.println();
		System.out.println("정답수: " + cnt_o);
		System.out.println("틀린수: " + cnt_x);
	}
}