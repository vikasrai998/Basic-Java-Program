package javaprogram;
public class Casting{
	public static Object order(int input){
		if(input==1){
			Coffee c1=new Coffee();
			return c1;
		}
		else {
			Tea t1=new Tea();
			return t1;
		}
	}
	public static void main(String[] args) {
		Casting d1=new Casting();
		Object x=d1.order(1);
		if(x instanceof Coffee){
			Coffee c=(Coffee)x;
			c.coffeeDetails();		
		}
		else{
			Tea t= (Tea)x;
			t.teaDetails();
		}
	}
}