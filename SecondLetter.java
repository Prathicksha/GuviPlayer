import java.util.Scanner;

public class SecondLetter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.next();
		String string1 = "";
		for (int i = 0; i < string.length(); i++) {
			if (i == 1) {
				string1 += Character.toUpperCase(string.charAt(i));
			} else {
				string1 += string.charAt(i);
			}
		}
		System.out.println(string1);
		scanner.close();
	}
}
