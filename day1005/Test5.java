//pdf ���ù��� �ݺ��� ����) lab 2��
/*
switch���� ���� �ǽ�
Ű���忡�� ���� �ϳ��� �о ������ ������� �����ϴ� ���α׷��� �ۼ�
��, �Լ��� ������� �ʰ� switch������ ����� ���ڸ� ����
*/

//�빮�ڷ� ������ �Է��� ��쿡�� ó���� �� �ֵ���
//'A','I','U','E,'O'�� ���� case�� �ۼ�

//������� ó���ϱ� ���� �� 5���� ���� ������ ������ ���ڵ���
//default���� �̿��� ������ ���� �޽��� ����ϵ��� �ۼ�
// "�Էµ� ���ڴ� ������ �ƴմϴ�."

import java.io.IOException;

class Test5
{
	public static void main(String[] args) throws IOException  //����ó��
	{
		
		System.out.print("���ڸ� �Է��ϼ���.");
		char c = (char)System.in.read();     //���ڸ� �о��
		switch(c){
			case 'a':case 'e':case 'i':case 'u':case 'o':case 'A':case 'E':case 'I':case 'U':case 'O':
				System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);
				break;
			default:
				System.out.println("�Էµ� ���ڴ� ������ �ƴմϴ�.");
	}
		/*if(c=='a'){
		System.out.printf("�Էµ� ����%c�� �����Դϴ�.",c);
		}*/
	}
}
