/*�迭 - 8������) �迭 a�� �迭 b�� �����Ϸ��� �ǵ��� �ۼ��Ǿ���.
���� �迭�� ����Ǵ°�? ���� �ùٸ��� �ʴٸ� �ùٸ��� �����϶�.  (���簡 �츮�� �����ϴ� �׷� ����� ������ ���� �ٸ�)
int[] a = {1,2,3,4,5};
int[] b = new int[5];
b = a; //�迭 a�� �迭 b�� ����
*/

class CopyArray2 
{
	public static void main(String[] args) 
	{
		int[] a = {1,2,3,4,5};
		int[] b = new int[5];
		b = a;   //��¥����
	    for(int i=0; i<a.length; i++){//��¥ ���簡 �ǵ��� �ڵ带 �߰�(a[0] = 100, b[0] = 1�� �ǰ�!)
			b[i] = a[i];   //b�� i��°�� �������ּ���. ����? a�� i��°��!
		}
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



/*stack����,heap����(���� �迭����ǵ��� �ùٸ� ����)
    a      12345 (100����)
	b      00000 (200����)
	a�� 0��° ����ִ� 1�� b�� 0��° �ڸ��� ��������
	�ݺ��� �����!

	for(int i=0; i<a.length; i++){
		b[i] = a[i];

��°��:
	a�迭�� ���
	 100    2    3    4    5
	b�迭�� ���
	  1    2    3    4    5
*/
