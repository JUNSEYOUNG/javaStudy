/*�迭 - 8������) �迭 a�� �迭 b�� �����Ϸ��� �ǵ��� �ۼ��Ǿ���.
���� �迭�� ����Ǵ°�? ���� �ùٸ��� �ʴٸ� �ùٸ��� �����϶�.  (���簡 �츮�� �����ϴ� �׷� ����� ������ ���� �ٸ�)
int[] a = {1,2,3,4,5};
int[] b = new int[5];
b = a; //�迭 a�� �迭 b�� ����
*/

class CopyArray 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int[] b = new int[5];
		b = a;

		System.out.println("a�迭�� ���");
		for(int i:a){
			System.out.printf("%5d",i);
		}
		System.out.println();
		System.out.println("b�迭�� ���");
		for(int i:b){
			System.out.printf("%5d",i);
		}




		a[0] = 100;
		System.out.println("--------------------");
		System.out.println("a�迭�� ���");
		for(int i:a){
			System.out.printf("%5d",i);
		}
		System.out.println();
		System.out.println("b�迭�� ���");
		for(int i:b){
			System.out.printf("%5d",i);
		}

	}
}



/*��°��:
a�迭�� ���
    1    2    3    4    5
b�迭�� ���
    1    2    3    4    5--------------------
a�迭�� ���
  100    2    3    4    5
b�迭�� ���
  100    2    3    4    5

a[0]�� 100�־����� b[0]�� 100�� �Ǿ���? �̷��� ��¥ ���簡 �ƴϴ�!
a[0]�� 100�־ b[0]�� 1�̾�� ��!
���� �ٲ�� ��¥ ���簡 �ƴ�
*/

//stack����,heap����
