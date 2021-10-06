/*배열,for문 연습하기) 5명의 점수를 입력받아 모두 출력하고 
최고점수와 최저점수를 각각 구하여 출력하기
*/

import java.util.Scanner;
class MaxMinOfScore
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		//int[] score = new int[10];
		int[] score = new int[5];

		for(int i=0; i<score.length; i++){      //0인덱스부터 4인덱스까지
			System.out.print((i+1) + "번째 학생의 점수를 입력하세요.==>"); //i가 0이면 1번째 학생, i가 1이면 2번째 학생
			score[i] = sc.nextInt();
		}

		int max,min;
		max = score[0];   //일단 최대값은 score의 0인덱스에 위치한 수라고 해보자
		min = score[0];   //일단 최소값은 score의 0인덱스에 위치한 수라고 해보자


		//배열 중에 가장 큰값과 가장 작은값을 찾을때
		//가장 큰값이 아니라고 가장 작은값이 되는것은 아님
		//그렇기 때문에 큰값을 찾기 위한 if문과 작은값을 찾기 위한 if문은 따로 써야함
		//{5,2,3,6,1}
		//만약 배열의 원소가 위와 같을 때 
		//max = 5가 담겨있고
		//min = 2가 담겨있고
		//i가 2라고 할 때 배열의 i번째 원소의 값 3이 max의 값 5보다 크지 않다고
		//min에 넣을 수는 없음 why?현재 min에는 i번째 원소의 값 3보다 더 작은 값이 있기 때문임
		//따라서 큰값을 찾는 if와 else로 처리하여 작은 값에 넣을 수 없음
		//큰값을 찾는 if와 작은값을 찾는 if를 따로 써야함
		for(int i=1; i<score.length; i++){  //1인덱스부터 4인덱스까지
			if(score[i] > max){             //score의 i번째 배열에 있는 값이 현재 max값으로 설정되어있는 score의 0번째 배열값보다 크다면
				max = score[i];
			}
			if(score[i] < min){            //else if도 가능은 함
				min = score[i];
			}        
		}
		System.out.println("가장 큰값:" + max);
		System.out.println("가장 작은값:" + min);
	}
}
