//이차원배열) 행마다 열의 크기가 다를 때 크기 나중에 정하기

class DifferentLaterSizeMatrix 
{
	public static void main(String[] args) 
	{
		int[][] a;
		a = new int[3][];   
		a[0] = new int[2];
		a[1] = new int[5];
		a[2] = new int[3];


		int n = 1;
		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){   //지금은 다 똑같으니까 i에 0이 와도됨
				a[i][j] = n++;
			}
		}
		for(int i=0; i<a.length; i++){  //모든 배열의 요소 출력
			for(int j=0; j<a[i].length; j++){
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
	}
}
