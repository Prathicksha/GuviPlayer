import java.util.Scanner;

public class ReverseAString {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string to be reversed");
		String string = scanner.next();
		String reverse = "";
		for (int i = string.length() - 1; i >= 0; i--) {
			reverse += string.charAt(i);
		}
		System.out.println(reverse);
		scanner.close();
	}
}
