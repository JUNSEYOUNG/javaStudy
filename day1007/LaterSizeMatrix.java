//이차원배열) 크기 나중에 정하는 연습

class LaterSizeMatrix 
{
	public static void main(String[] args) 
	{
		int[][] a;
		a = new int[3][4];   //12칸

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
