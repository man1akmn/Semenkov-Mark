import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Scanner;

class Task1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();
		String regexStr = "[A-Z]{2}[-][1-9]{3}";
		System.out.println(str.matches(regexStr));
	}
}