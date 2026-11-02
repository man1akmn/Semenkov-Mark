import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher(str);

		boolean found = false;

		while (matcher.find()) {
			System.out.println(matcher.group());
			found = true;
		}

		if (!found) {
			System.out.println("NONE");
		}
	}
}