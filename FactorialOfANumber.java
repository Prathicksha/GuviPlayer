import java.util.Scanner;

public class FactorialOfANumber {
	public int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact = fact * i;
		}
		return fact;
	}

	public static void main(String[] args) {
		FactorialOfANumber number = new FactorialOfANumber();
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number");
		int num = scanner.nextInt();
		int num1 = number.factorial(num);
		System.out.println(num1);
		scanner.close();
	}
}
