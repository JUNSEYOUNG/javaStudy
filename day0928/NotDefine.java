class NotDefine
{
	public static void main(String[] args) 
	{

		name = "전세영";
		System.out.println("이름은" + name);
	}
}

/*C:\javaStudy\day0928>java NotDefine.java

C:\javaStudy\day0928>javac NotDefine.java

C:\javaStudy\day0928>javac NotDefine.java
NotDefine.java:5: error: cannot find symbol
                name = "전세영";
                ^
  symbol:   variable name
  location: class NotDefine
NotDefine.java:6: error: cannot find symbol
                System.out.println("이름은" + name);
                                           ^
  symbol:   variable name
  location: class NotDefine
2 errors





*/

