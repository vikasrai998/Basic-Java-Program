package javaprogram;
public class Encaptulation1 {
	private String name;
	private int age;
	private double perc;
	public void setName(String name)
	{
		this.name=name;
	}
	public void setAge(int age)
	{
		if(age>0&&age<=100)
		{
			this.age=age;
		}
		else
		{
			System.out.println("Invalid - age");
		}
	}
	public void setPerc(double perc)
	{
		if(perc>0&&perc<=100)
		{
			this.perc=perc;
		}
		else
		{
			System.out.println("Invalid - perc");
		}
	}
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public double getPerc()
	{
		return this.perc;
	}
}
