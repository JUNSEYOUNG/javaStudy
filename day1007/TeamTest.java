/*������������)
������ �迭 �ΰ��� �Ű������� ���޹޾� �� �迭�� ���� ������ ������ �����Ǿ� �ִ��� �Ǻ��Ͽ� 
����� ��ȯ�ϴ� �޼ҵ带 �����ϰ� ȣ���� ����(��, Ŭ������, �޼ҵ�� ���� �����Ӱ� �մϴ�.)
*/

class MyUtil
{
	void printArray(int[] a, int[] b){
		if(a.length != b.length){
			System.out.println("�� �迭�� ���̰� �ٸ��ϴ�.");
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
			System.out.println("�� �迭�� ���� �����մϴ�.");
		}else{
			System.out.println("�� �迭�� ���� �������� �ʽ��ϴ�.");
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
