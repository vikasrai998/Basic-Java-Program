package javaprogram;

public class LipstickClasscast{
	String name;
	int price;
	LipstickClasscast(String n,int p)
	{
		this.name=n;
		this.price=p;
	}
	public String toString()
	{
		return this.name+" "+this.price;
	}
}
