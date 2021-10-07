//이차원배열) 각 행마다 열의 크기가 다를 때!
class LengthOfArray 
{
	public static void main(String[] args) 
	{
		int[][] a = {{1,2},{3,4,5,6,7},{8,9,10}};
		//a는 이차원배열 이름이며, a.length는 3임

		for(int i=0; i<a.length; i++){
			for(int j=0; j<a[i].length; j++){
				System.out.printf("%5d",a[i][j]);
			}
			System.out.println();
		}
	}
}
