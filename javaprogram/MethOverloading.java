package javaprogram;
public class MethOverloading {
	//method over loading
	int a;
	String b;
	static void Test(int a)
	{
		System.out.println("vikas");
	}
	static void Test(String b)
	{
		System.out.println("mukul");
	}
	static void Test(int a, String b)
	{
		System.out.println("jeevan");
	}
	static void Test(String b, int a)
	{
		System.out.println("!!! RAIBOSSSS !!!");
	}
	public static void main(String[] args) {
		MethOverloading m1=new MethOverloading();
		m1.Test(10 , "vikas");
		m1.Test( 10);
		m1.Test( "vikas");
		m1.Test( "vikas",10);
	}
}
