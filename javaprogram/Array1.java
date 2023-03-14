package javaprogram;

public class Array1 
{
	public static void test(int a[])
	{
	
		for (int i=0; i<=a.length; i++)
		{
			System.out.println(a[i]);
			a[3]=20;
		}
	}
	public static void main(String[] args) 
	{
		int a[]= {3,5,7,8};
		
		
		test(a);
	}
}
