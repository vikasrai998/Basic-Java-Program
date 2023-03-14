package javaprogram;
// Recursion is a process of method calling it self for execution it is called recursion method repeting again and again 

public class Recursion 
{
	public static  void test()
	{
		System.out.println("hellooo");
		test();
	}

	public static void main(String[] args) 
	{
		System.out.println("HII VIKAS");
		test();
	}
}


//// example -2
//
//// Recursion
//
//public class Recursion 
//{
//	
//		public static void toPrint(int i)
//		{
//			if (i==8)
//			{
//			return;
//			}
//		
//		System.out.println(i);
//		i++;
//		toPrint(i);
//	}
//	 public static void main(String[] args) 
//	 {
//		 toPrint(5);
//	 }
//	
//}


