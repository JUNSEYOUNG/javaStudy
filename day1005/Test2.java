//pdf ���ù��� �ݺ��� ����) programming 9��

/*������ ���� ���ǵǴ� �Լ��� �Լ����� ����Ͽ� ����. 
����ڷκ��� x���� �Է¹޾Ƽ� �Լ����� ����Ͽ� ȭ�鿡 ����Ѵ�. x�� �Ǽ��̴�.(double)
f(x) = x^3 - 9x + 2   ( x <= 0 )
f(x) = 7x + 2    ( x > 0 )

�� ���� �߿� �ϳ� �����ϵ��� �ؾ���
*/

import java.util.Scanner;
class Test2 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		double x,result;
		System.out.print("x�� �Է��ϼ���.==>");
		x = sc.nextDouble();

		if(x <= 0){
			result = (x*x*x) - (9*x) + 2;     //������ ()�� ǥ��
		}else{
			result = (7*x) + 2;
		}
		System.out.println("���: " + result); //���̵� �����̵� �������ؾߵǴϱ� if�� ������ ��
	}
}
