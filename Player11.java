import java.util.Scanner;

public class Player11 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the day:");
		String days = scanner.nextLine();
		workingDay(days);
		scanner.close();
	}

	public static void workingDay(String day) {
		if ((day.equalsIgnoreCase("saturday"))
				|| (day.equalsIgnoreCase("sunday"))
				|| (day.equalsIgnoreCase("sat"))
				|| (day.equalsIgnoreCase("sun"))) {
			System.out.println("False");
		} else if ((day.equalsIgnoreCase("monday"))
				|| (day.equalsIgnoreCase("tuesday"))
				|| (day.equalsIgnoreCase("wednesday"))
				|| (day.equalsIgnoreCase("thursday"))
				|| (day.equalsIgnoreCase("friday"))
				|| (day.equalsIgnoreCase("mon"))
				|| (day.equalsIgnoreCase("tue"))
				|| (day.equalsIgnoreCase("wed"))
				|| (day.equalsIgnoreCase("thu"))
				|| (day.equalsIgnoreCase("fri"))) {
			System.out.println("True");
		} else {
			System.out.println("Invalid Day");
		}
	}
}
