//����) ��������� �ΰ��� ������ �Է¹޾� 
//���ϱ�, ����, ���ϱ�, ������ �� ����� 
//����ϴ� ���α׷��� �ۼ�, ����, ������, ������ ���ϴ�

import java.util.Scanner;

class CalcTest{
    public static void main(String []args){
       Scanner sc = new Scanner(System.in);
       int first, second, add, sub, multi, div;

       System.out.println("ù��° ���� �Է��ϼ���.");
       first = sc.nextInt();
       System.out.println("�ι�° ���� �Է��ϼ���.");
       second = sc.nextInt();
       add = first + second;
       sub = first - second;
       multi = first * second;
       div = first / second;

       System.out.println(" ** ��� ��� ** ");
       System.out.println("���ϱ�:" + add);
       System.out.println("����:" + sub);
       System.out.println("���ϱ�:" + multi);
       System.out.println("������:" + div);
  }
}
