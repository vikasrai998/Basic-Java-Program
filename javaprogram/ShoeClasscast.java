package javaprogram;

public class ShoeClasscast {
	String brand, colour;
	int price;
	ShoeClasscast(String b, String c, int p){
		this.brand=b;
		this.colour=c;
		this.price=p;
	}
	public String toString()
	{
		return this.brand+" "+this.colour+" "+this.price;
	}
}
