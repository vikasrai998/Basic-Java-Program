package javaprogram;

public class ExceptionThrowable {

	public static void main(String[] args) {
		try
		{
		System.out.println("try-Start");
		int a[]= {};
		System.out.println(a[5]);
		System.out.println(100/0);//Arithmetic exception
		
		System.out.println("try-End");
	}
	catch(Throwable x)
	{
		System.out.println("array");
	}
	System.out.println("end");
	}
}
