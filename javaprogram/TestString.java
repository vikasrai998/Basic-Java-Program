package javaprogram;
import java.util.Scanner;
public class TestString {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first string");
		String str=sc.nextLine();
		System.out.println("enter second String");
		String str2=sc.nextLine();
		System.out.println("enter position");
		int pos=sc.nextInt();
		String newStr="";
		for (int i=0; i<pos; i++) {
			newStr=newStr+str.charAt(i);
		}
		newStr=newStr+str2;
		for(int i=pos; i<str.length();i++) {
			newStr=newStr+str.charAt(i);
		}
		System.out.println(newStr);
	}

}
