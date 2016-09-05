package chapter01;

public class ConstantTest {
	public static void main(String[] args) {
		int number = 10;
		System.out.println( number );
		
		number = 20;
		System.out.println(number);
		
		final int CONSTNUMBER = 10;
		System.out.println(CONSTNUMBER);
		// CONSTNUMBER = 20;
	}
}
