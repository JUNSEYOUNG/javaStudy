//??Ʈ?????? & | ^ ????(?¹ٲܶ? ?ӽú??? 1?? ?????ؾ??Ѵٴ? ??) 
//<StringŸ???? ?????? ?ӽú??? 1?? ?????ؾ? ?¹ٲ? ?? ????>

class SwapTest    //?ٲ۴ٴ? ?? swap
{
	public static void main(String[] args) 
	{
		String cup1 = "Ŀ??";
		String cup2 = "????";

		System.out.println("??1:"+cup1);
		System.out.println("??2:"+cup2);

		//??1:Ŀ??
		//??2:????

		//??1,2?? ?ִ? ???Ĺ??? ?¹ٲٰ? ?ͳ?? ????ϸ? ???????
		//?? ???? ?ϳ? ?? ???????ǰڴ?! 
		//??1?? ?ִ? Ŀ?Ǹ? ?? ?ſ? ?????? ?? ?ſ? Ŀ?ǰ? ?????????
		//??2?? ?ִ? ?????? ??1?? ????
		//?? ?ſ? ?ִ? Ŀ?Ǹ? ??2?? ???°ž?
		//?׷? ?? ?ſ??? ?ƹ??͵? ?? ???? ????!
		//?Ʒ????? ?ڵ??غ???

		String cup3;  //???? ??????(???ο? ?ӽú???????)
		cup3 = cup1;
		cup1 = cup2;
		cup2 = cup3;

		System.out.println("?ΰ??? ???? ?????? ???? ?ٲپ????ϴ?.");
		System.out.println("??1:"+cup1);
		System.out.println("??2:"+cup2);

		//??1:????
		//??2:Ŀ??

	}
}
