package javaprogram;
public class MethodOverridingchild extends MethodOverriding {
	@Override
	 void Drink() {	
		System.out.println("Coffee");
		}
	public static void main(String[] args) {
		MethodOverriding s11=new MethodOverriding();
		s11.Car="lamborgani";
		s11.Salary=2000000;
		System.out.println(s11.Car);
		System.out.println(s11.Salary);
		s11.Drink();
		}
	}