/*삼차원배열(다차원 배열) 연습) 2면 3행 4열의 3차원 배열을 생성하고
첫번째 면에는 모두 1을 저장하고
두번째 면에는 모두 2를 저장하고
모든 배열의 요소를 면,행,열을 구분되도록 출력해보기
*/

class ThreeDimensionArray 
{
	public static void main(String[] args) 
	{
		int[][][] a = new int[2][3][4];  //2면 3행 4열  //정수형 기억장소 24개 생성
		
		for(int i=0; i<2; i++){          //면:0,1
			for(int j=0; j<3; j++){      //행:0,1,2
				for(int k=0; k<4; k++){   //열:0,1,2,3
					a[i][j][k] = i+1;    //명령어 24번 동작함
			}
		}
	}

        for(int i=0; i<2; i++){
			for(int j=0; j<3; j++){
				for(int k=0; k<4; k++){
				System.out.printf("%5d",a[i][j][k]);
			}
			System.out.println();
		}
		System.out.println();
	}
}
}