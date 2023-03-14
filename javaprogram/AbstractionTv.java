package javaprogram;

public class AbstractionTv extends AbstractionSwitch 
	{
		void switchon()
		{
			System.out.println("T.v. on");
		}
		void switchoff()
		{
			
			System.out.println("T.v. off");
		}
		public static void main(String[] args) {
			AbstractionTv t1=new AbstractionTv();
			t1.switchon();
			t1.switchoff();
	}
}
