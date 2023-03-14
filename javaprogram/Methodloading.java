package javaprogram;
// Method overloading
public class Methodloading {
	int a;
	String b;
	public void test(int a) 
	{
		System.out.println("mukul");
	}
	  public void test(int a,String b) 
	  { 
		  System.out.println("vikas rai"); 
	  }
	  
	  public static void test(String b,int a) 
	  {
		  System.out.println("jeevan bhaiya"); 
		 }
	 
	public static void main(String[] args) 
	{
		Methodloading m1=new Methodloading();
		m1.test(10);
		m1.test(10 , "vikas");
		m1.test("vikas",10);
	}

}

