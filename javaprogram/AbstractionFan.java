package javaprogram;

public class AbstractionFan extends AbstractionSwitch
{
	void switchon()
	{
		System.out.println("fan on");
	}
	void switchoff()
	{
		
		System.out.println("fan off");
	}
	public static void main(String[] args) {
		AbstractionFan f1=new AbstractionFan();
		f1.switchon();
		f1.switchoff();
		
	}

}
