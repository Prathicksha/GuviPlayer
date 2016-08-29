import java.util.Scanner;

public class ReverseTheDigits {
	public int reverse(int n) {
		int rem = 0;
		int sum = 0;
		while (n != 0) {
			rem = n % 10;
			n = n / 10;
			sum = (sum * 10) + rem;
		}
		return sum;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the number to be reversed");
		int number = scanner.nextInt();
		ReverseTheDigits digits = new ReverseTheDigits();
		int num = digits.reverse(number);
		System.out.println(num);
		scanner.close();
	
