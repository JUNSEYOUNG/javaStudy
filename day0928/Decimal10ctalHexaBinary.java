class Decimal10ctalHexaBinary 
{
	public static void main(String[] args) 
	{
		int a = 12;   //그냥 숫자만 쓰면 java는 10진수로 앎(java는 10진수가 기본출력임)
		int b = 014;  //숫자앞에 0을 붙이면 java가 8진수로 앎 > 10진수로 하면 12
		int c = 0xc;   //숫자앞에 0x를 붙이면 16진수로 표현됨 > 10진수로 하면 12  
		int d = 0b1100;  //숫자앞에 0b를 붙이면 2진수로 표현됨 > 10진수로 하면 12

		System.out.println(a);
		System.out.println(b);
	}
}

/*
8진수      10진수    16진수     2진수
0           0       0        0
1           1       1        1
2           2       2        10
3           3       3        11
4           4       4        100
5           5       5        101
6           6       6        110 
7           7       7        111
10          8       8        1000
11          9       9        1001 
12          10      A        1010
13          11      B        1011
14          12      C        1100 
            13      D        1101
            14      E        1110
			15      F        1111 
			16      10
			17      11

*/
