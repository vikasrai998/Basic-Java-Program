package javaprogram;

public class Exception {

		public static void main(String[] args) {
			
			try {
				System.out.println("hii vikas baba");
				
				System.out.println(100/0);
				int a[]= {};
				System.out.println(a[3]);
				System.out.println("hello mukul bhai");
			}
			catch(ArithmeticException e){
				System.out.println("ArithmeticException");
			}
			catch(ArrayIndexOutOfBoundsException e){
				System.out.println("ArrayIndexOutOfBoundsException");
			}
			
			finally
			{
				System.out.println("close all the costly resources");
			}
			System.out.println("raishab ram ram");
		}

	}