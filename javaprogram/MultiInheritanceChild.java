package javaprogram;

public class MultiInheritanceChild implements MultiInheritanceMother,MultiInheritanceFather
{

	
	@Override
	public void display()
	{
		System.out.println("vikasss");
		
	}

	@Override
	public void test()
	{
		System.out.println("helloo");		
	}
	public static void main(String[] args) {
		MultiInheritanceChild c1=new MultiInheritanceChild();
		c1.test();
		c1.display();
	}

}
