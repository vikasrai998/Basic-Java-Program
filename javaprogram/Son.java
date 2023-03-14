package javaprogram;
public class Son extends Parant {
	@Override
	void Drinking()
	{
		System.out.println("Coffey");
	}
	public static void main(String[] args) {
		Son s1=new Son();
		s1.Price=8700000;
		s1.color="black";
		
		System.out.println(s1.Price);
		System.out.println(s1.color);
		s1.Drinking();
		s1.Smoking();
	}
}
