import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String login = scanner.nextLine();
		String regexLogin = "[a-z][A-Z0-9_]{2,11}";
		System.out.println(login.matches(regexLogin));
	}
}