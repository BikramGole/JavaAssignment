import java.util.Scanner;

public class Lab1_1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter first integer: ");
		int a = sc.nextInt();

		System.out.print("Enter second integer: ");
		int b = sc.nextInt();

		System.out.println("Sum = " + (a + b));
		System.out.println("Difference = " + (a - b));
		System.out.println("Product = " + (a * b));

		if (b != 0) {
			System.out.println("Exact Division = " + ((double) a / b));
		} else {
			System.out.println("Division by zero is not allowed.");
		}

		sc.close();
	}
}