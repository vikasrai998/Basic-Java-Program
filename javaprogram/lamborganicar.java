package javaprogram;
// child class
public class lamborganicar extends Car
{
	//override
	void topSpeed()
	{
		System.out.println(" 320 kmph");
	}
	public static void main(String[] args) 
	{
		lamborganicar l1=new lamborganicar();
		
		l1.price= 60000000;
		l1.color= "black";
		System.out.println(l1.color);
		System.out.println(l1.price);
		l1.topSpeed();
	}
}
