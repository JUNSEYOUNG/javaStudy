//for each반복문을 이용해 배열의 요소 모두 출력해보기

class ForEachTest 
{
	public static void main(String[] args) 
	{
		String[] name = {"김지현","윤서우","임상진","정자영","최현호","임하연"};

		for(String i:name){
			System.out.println(i);
		}
	}
}
	/*
	for(int i=0; i<name.length; i++){ 
		System.out.println(name[i]);    인덱스 의미
		}
	}
}
	*/




/*for 괄호안에 콜론이 오고 오른쪽에는 배열이름을 써줌
콜론 왼쪽에 배열의 요소를 하나씩 꺼집어 내어올 변수이름을 자료형과 함께 써줌
즉, 배열의 요소를 차례로 꺼내와서 변수에 담기게 됨
하나씩 꺼집어 내어와서 담을 변수의 자료형은 배열의 자료형과 일치되게 써야함

int[] kor = {10,20,30,40,50}
위의 배열의 요소만큼 반복 실행시키는 명령을 for each로 표현함
for(int v : kor){      
	System.out.print(v)
}
//kor배열에 있는 원소를 하나씩 꺼집어 내어와서 v에 담으라는 뜻
맨처음 꺼내온 10이 v에 담기고 그다음 20이 v에 담김
배열의 원소를 차례대로 배열의 원소만큼 실행함
*/