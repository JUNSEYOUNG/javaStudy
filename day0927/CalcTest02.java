//����) ��������� �ΰ��� ������ �Է¹޾� 
//���ϱ�, ����, ���ϱ�, ������ �� ����� 
//����ϴ� ���α׷��� �ۼ�, ����, ������, ������ ���ϴ�

import java.util.Scanner;

class CalcTest02{
       public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int first, second;
       System.out.println("ù��° ���� �Է��ϼ���.");
       first = sc.nextInt();
       System.out.println("�ι�° ���� �Է��ϼ���.");
       second = sc.nextInt();
      

       System.out.println(" ** ��� ��� ** ");
       System.out.println("���ϱ�:" + (first+second));
       System.out.println("����:" + (first-second));
       System.out.println("���ϱ�:" + (first*second));
       System.out.println("������:" + (first/second));
  }
}
