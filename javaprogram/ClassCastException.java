package javaprogram;
//ShoeClassCast and LipstickClass
public class ClassCastException 
{
	public static void main(String[] args) 
	{
		ShoeClasscast S1=new ShoeClasscast("Nike", "Black",10000);
		ShoeClasscast S2=new ShoeClasscast("RBK", "Black",10000);
		ShoeClasscast S3=new ShoeClasscast("PUMA", "Black",10000);
		LipstickClasscast L1=new LipstickClasscast("lakme",600);
		LipstickClasscast L2=new LipstickClasscast("Sugar",1000);
		LipstickClasscast L3=new LipstickClasscast("Mac",900);
		Object x[]= {S1,S2,S3,L1,L2,L3};
		Object a=x[0]; // s1 upcasting
		Object b=x[1]; // s2 upcasting
		System.out.println(a);
		ShoeClasscast m=(ShoeClasscast)b; //downcasting
		System.out.println(m);
   
 		LipstickClasscast l=(LipstickClasscast)b;     //classcast exception
 		System.out.println(l);	
	}
}	