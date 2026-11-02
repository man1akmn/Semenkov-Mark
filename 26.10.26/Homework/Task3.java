import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.Scanner;

class Task3 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		String str = scanner.nextLine();

		System.out.println(str.replaceAll("[0-9]+","#"));
	}
}