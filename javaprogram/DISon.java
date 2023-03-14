package javaprogram;

public class DISon implements DIfather,DImother {

	public static void main(String[] args) {
		DIfather.care();
		DImother.care();
	}

}