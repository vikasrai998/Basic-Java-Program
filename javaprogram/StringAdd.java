package javaprogram;
import java.util.Scanner;
public class StringAdd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first String");
		String st1=sc.nextLine();
		System.out.println("Enter the second String");
		String st2=sc.nextLine();
		System.out.println("Enter the index number");
		int index=sc.nextInt();
		String str=new String();
		for (int i=0; i<st1.length(); i++)
		{
			str+=st1.charAt(i);
			if(i==index)
			{
				str=str+st2;
			}
		}
	System.out.println(str);
	}
}