/*팀별연습문제)
정수형 배열 두개를 매개변수로 전달받아 두 배열이 서로 동일한 값으로 구성되어 있는지 판별하여 
결과를 반환하는 메소드를 정의하고 호출해 보기(단, 클래스명, 메소드명 등은 자유롭게 합니다.)
*/

class MyUtil
{
	void printArray(int[] a, int[] b){
		if(a.length != b.length){
			System.out.println("두 배열의 길이가 다릅니다.");
			return;
		}

		boolean flag = true;

		for(int i=0; i<a.length; i++){
			if(a[i] != b[i]){
				flag = false;
				break;
			}
		}

		if(flag){
			System.out.println("두 배열의 값은 동일합니다.");
		}else{
			System.out.println("두 배열의 값은 동일하지 않습니다.");
		}
	}
}


class TeamTest
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5,6,7,8,9};
		int[] b = {1,2,3,4,5};

		MyUtil util = new MyUtil();
		util.printArray(a,b);
	}
}
