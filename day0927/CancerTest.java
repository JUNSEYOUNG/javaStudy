//����) ���ο����� �ų� 40�� �̻��� ����鿡�� ����ϰ����� �ǽ��ϰ�
//�ֽ��ϴ�. �̸��� ���̸� �Է¹޾� ����ϰ��� ��������� �Ǻ��Ͽ� 
//����� ����ϴ� ���α׷��� �ۼ��ϰ�, �����ϰ�, �������Ͽ� 
//������ ���ϴ�. (Ŭ�����̸�, ������ ���� �����Ӱ� �մϴ�.)

import java.util.Scanner;

class CancerTest{
    public static void main(String []args){
      Scanner sc = new Scanner(System.in);

      String name;
      int age;
      System.out.println("�̸��� �Է��ϼ���.");
      name = sc.next();
      System.out.println("���̸� �Է��ϼ���.");
      age = sc.nextInt(); 

      if(age >= 40)
      System.out.println("����ϰ��� ������Դϴ�.");
      else
      System.out.println("����ϰ��� ����ڰ� �ƴմϴ�.");
 }
}