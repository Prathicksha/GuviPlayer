import java.util.Scanner;

public class StringToInteger {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = scanner.next();
		int number = 0;
		for (int i = 0; i < str.length(); i++) {
			if (Character.isDigit(str.charAt(i))) {
				number = Integer.parseInt(str);
				System.out.println(number);
				break;
			}
			if (Character.isAlphabetic(str.charAt(i))) {
				System.out.println("Invalid");
				break;
			}
		}
		
		scanner.close();
	}
}
