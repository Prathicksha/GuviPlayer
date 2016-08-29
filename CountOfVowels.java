import java.util.Scanner;

public class CountOfVowels {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the string");
		String string = scanner.nextLine();
		int count = 0;
		int c = 0;
		for (int i = 0; i < string.length(); i++) {
			c = string.charAt(i);
			if ((c == 'a') || (c == 'e') || (c == 'i') || (c == 'o')
					|| (c == 'u') || (c == 'A') || (c == 'E') || (c == 'I')
					|| (c == 'O') || (c == 'U')) {
				count++;
			}
		}
		System.out.println(count);
		scanner.close();
	}
}
