//1�� ����)� �л��� �̹� �б⿡ ��ǻ�Ͱ���, c��� ���α׷���, ����, �Ϲ� ������ ������û�ߴٰ� ����.
//�� ������ ������ �Է��ϸ� �� �л��� �̹� �б� ��� ������ ����ϴ� ���α׷��� �ۼ��ض�.

import java.util.Scanner;

class Test{
   public static void main(String []args){
   Scanner sc = new Scanner(System.in);

   int com, clang, eng, math, tot, avg;

   System.out.println("��ǻ�Ͱ��� ������ �����ΰ���?");
   com = sc.nextInt();
   System.out.println("c��� ���α׷��� ������ �����ΰ���?");
   clang = sc.nextInt();
   System.out.println("���� ������ �����ΰ���?");
   eng = sc.nextInt();
   System.out.println("�Ϲ� ���� ������ �����ΰ���?");
   math = sc.nextInt();

   tot = com + clang + eng + math;
   avg = tot / 4;

   System.out.println(" ** ��� ��� ** ");
   System.out.println("��ǻ�Ͱ���:" + com);
   System.out.println("c��� ���α׷���:" + clang);
   System.out.println("����:" + eng);
   System.out.println("�Ϲݼ���:" + math);
   System.out.println("����:" + tot);
   System.out.println("���:" + avg);
   }
}

   
   