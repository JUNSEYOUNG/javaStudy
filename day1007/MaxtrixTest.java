//이차원배열(다차원배열)

class MaxtrixTest 
{
	public static void main(String[] args) 
	{
		int[][] a;
		a = new int[5][3]; //5행(i) 3열(j) //가로인덱스:0~4,세로인덱스:0~2

		int n = 1;
		for(int i=0; i<5; i++){    //가로인덱스 4까지
			for(int j=0; j<3; j++){      //세로인덱스 2까지
				a[i][j] = n++;   //명령어 15번 동작함(15개의 배열에 1씩 증가된 값 넣기)
				//0  0
				//0  1
				//0  2
				//1  0
				//1  1
				//1  2
				 // .
				 // .
			}
		}



		for(int i=0; i<5; i++){
			for(int j=0; j<3; j++){
				System.out.printf("%5d",a[i][j]);   //5d > 5칸을 잡아서 출력해라
			}
			System.out.println();  //한 행이 모두 출력되면 줄바꾸기
			}
		}
	}
