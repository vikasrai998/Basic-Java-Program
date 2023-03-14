package javaprogram;
public class EnStudentTest extends EnStudent 
{

	public static void main(String[] args) {
		EnStudent en1= new EnStudent();
		
		en1.setname("vikas");
		en1.setage(24);
		
		System.out.println(en1.getName());
		System.out.println(en1.getAge());
	}

}
