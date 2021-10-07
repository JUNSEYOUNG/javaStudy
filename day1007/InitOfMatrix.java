class InitOfMatrix 
{
	public static void main(String[] args) 
	{
		int[][] a = { {1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15} }; //배열선언하면서 이차원배열 초기화 /행3개(뭉텅이),열5개({}안에 개수 > 1행 5열,2행 5열,3행 5열)

		for(int i=0; i<3; i++){  
			for(int j=0; j<5; j++){
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
	}
}
