package javaprogram;
import java.io.FileNotFoundException;
import java.io.FileReader;

public class ThrowException {

	static void display()throws FileNotFoundException
	{
		FileReader fr=new FileReader("ThrowException.txt");
		
	}
	public static void main(String[] args) 
	{
		System.out.println("Start");
		try {
			display();
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
		System.out.println("END");
	}
}