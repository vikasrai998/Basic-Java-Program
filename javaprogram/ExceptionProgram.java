package javaprogram;

public class ExceptionProgram {

	public static void main(String[] args) {
		try{
			System.out.println("Start");
		System.out.println(100/0); // riscky code
				System.out.println("after exception");
		}
//		catch(ArithmeticException e)
//		{
//		System.out.println("Hello exception");	
//		}
		catch(Throwable e)
		{
		System.out.println("this is an exception");	
		}
		
		System.out.println("end");
	}

}
