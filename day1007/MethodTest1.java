//�޼ҵ�) �������� ����ϴ� �޼ҵ� ������
class MyUtil
{
	void gugudan(int dan){
		System.out.printf("***%d��***\n",dan);
		for(int i=1; i<=9; i++){
			System.out.printf("%d*%d=%d\n",dan,i,dan*i);
		}
		return;     //���� �� ��� �����Ǿ� ����
	}
}




class MethodTest1 
{
	public static void main(String[] args) 
	{
		MyUtil mu = new MyUtil();          //��ü����
		mu.gugudan(9);
		System.out.println("==================");
		mu.gugudan(10);
	}
}
