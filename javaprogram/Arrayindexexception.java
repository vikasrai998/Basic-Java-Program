package javaprogram;

public class Arrayindexexception {

	public static void main(String[] args) {
		
		try {
			System.out.println("hii");
			int a[]= {};
			
			System.out.println(a[3]);
			System.out.println(100/0);
		}
		catch(ArrayIndexOutOfBoundsException e){
			System.out.println("vi");
		}
		catch(ArithmeticException e){
			System.out.println("ai");
		}
		finally
		{
			System.out.println("close all the costly resources");
		}
		System.out.println("raishab ram ram");
	}
}
