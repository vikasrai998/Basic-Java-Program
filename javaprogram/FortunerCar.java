package javaprogram;
//child class
public class FortunerCar extends Car 
{

	public static void main(String[] args) 
	{
		FortunerCar f1=new FortunerCar();
		f1.color="white";
		f1.price= 5000000;
		f1.topSpeed();
		
		System.out.println(f1.color);
		System.out.println(f1.price);
	}
}
