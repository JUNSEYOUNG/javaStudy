//����)ȫ�뿡 �ִ� �ֿ�Ŭ�������� �������� ���Ͽ� �̸�,����,Ű�� �Է¹޾�
//���������� �ϰ� �־��.
//���̰� 20�� �̻��̰� Ű�� 160�����̸� "���尡��" �׷��� ������ "����Ұ���"�� 
//����ϴ� ���α׷��� �ۼ�, ����, ������ �� ����

import java.util.Scanner;

class ClubTest{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);

   String name;
   int age, key;
   
   System.out.println("�̸��� �Է��ϼ���.");
   name = sc.next();
   System.out.println("���̸� �Է��ϼ���.");
   age = sc.nextInt();
   System.out.println("Ű�� �Է��ϼ���.");
   key = sc.nextInt();

   if(age >= 20 && key <= 160)
      System.out.println(name + "��, ���尡���մϴ�.");
      else
      System.out.println(name + "��, ����Ұ����մϴ�.");
}
}
  
