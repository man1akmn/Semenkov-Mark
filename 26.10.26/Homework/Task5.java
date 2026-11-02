import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		int c = 0;
		boolean found = false;

		Pattern pattern = Pattern.compile("[a-zA-Z]+");
		Matcher matcher = pattern.matcher(str);

		while (matcher.find()) {
			c++;
			found = true;
		}

		if (found) {
			System.out.println(c);
		} else {
			System.out.println(0);
		}
	}
}