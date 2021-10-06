//5명 학생의 이름,점수들을 입력받아 
//성적이 높은순으로 정렬하여 출력하는 프로그램을 작성하시오.(내림차순 정렬)

import java.util.Scanner;
class StudentTest 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		String[] name = new String[5];       //5명 이름받기
		int[] kor = new int[5];              //국어점수 받기
		int[] eng = new int[5];              //영어점수 받기
		int[] math = new int[5];             //수학점수 받기
		int[] tot = new int[5];              //합계
		double[] avg = new double[5];        //평균

		for(int i=0; i<name.length; i++){
			System.out.print((i+1)+"학생의 이름을 입력하세요.==>");
			//System.out.print("%d학생의 이름을 입력하세요.==>",i+1);
			name[i] = sc.next();
			System.out.print((i+1)+"학생의 국어점수를 입력하세요.==>");
			kor[i] = sc.nextInt();
			System.out.print((i+1)+"학생의 영어점수를 입력하세요.==>");
			eng[i] = sc.nextInt();
			System.out.print((i+1)+"학생의 수학점수를 입력하세요.==>");
			math[i] = sc.nextInt();

			tot[i] = kor[i]+eng[i]+math[i];
			avg[i] = tot[i] / 3.0;
		}
		for(int i=0; i<name.length; i++){
			for(int j=i+1; j<name.length; j++){
				if(avg[j] > avg[i]){
					String temp1 = name[i];
					name[i] = name[j];  //이름바꿔(내림차순)
					name[j] = temp1;

					int temp2 = kor[i];
					kor[i] = kor[j];
					kor[j] = temp2;

					temp2 = eng[i];     //영어점수도 temp2 그대로쓸수있음! 같은 int니까!
					eng [i] = eng[j];
					eng[j] = temp2; 

					temp2 = math[i];    //수학점수도 마찬가지!
					math[i] = math[j];
					math[j] = temp2;

					temp2 = tot[i];     //합계도 마찬가지!
					tot[i] = tot[j];
					tot[j] = temp2;

					double temp3 = avg[i];   //평균바꿔(내림차순)
					avg[i] = avg[j];
					avg[j] = temp3;
					
					}//end if
				}//end for j
			}//end for i
			
			System.out.println("**성적처리결과**");
			System.out.println("이름\t국어\t영어\t수학\t합계\t평균");   // \t 간격맞출수있음
			for(int i=0; i<name.length; i++){
				//System.out.println(name[i]+"\t"+kor[i]+"\t"+math[i]+"\t"+tot[i]+"\t"+avg[i]+"\t");
				System.out.printf("%s\t%d\t%d\t%d\t%d\t%.1f\n",name[i],kor[i],eng[i],math[i],tot[i],avg[i]);
			}
		}
	}