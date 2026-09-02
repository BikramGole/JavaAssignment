public class Lab1_3 {
	public static void main(String[] args) {

		int a = 10;
		int b = 20;

		// Relational Operators
		System.out.println("a == b : " + (a == b));
		System.out.println("a != b : " + (a != b));
		System.out.println("a < b : " + (a < b));
		System.out.println("a > b : " + (a > b));
		System.out.println("a <= b : " + (a <= b));
		System.out.println("a >= b : " + (a >= b));

		// Logical Operators
		boolean x = true;
		boolean y = false;

		System.out.println("x && y : " + (x && y));
		System.out.println("x || y : " + (x || y));
		System.out.println("!x : " + (!x));

		// Assignment Operators
		int c = 5;
		c += 3;
		System.out.println("c += 3 : " + c);

		c -= 2;
		System.out.println("c -= 2 : " + c);

		// Bitwise Operators
		System.out.println("a & b : " + (a & b));
		System.out.println("a | b : " + (a | b));
		System.out.println("a ^ b : " + (a ^ b));

		// Ternary Operator
		String result = (a > b) ? "a is greater" : "b is greater";
		System.out.println(result);
	}
}