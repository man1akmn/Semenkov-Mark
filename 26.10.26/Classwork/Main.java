import java.util.regex.Matcher;
import java.util.regex.Pattern;

class Main {
	public static void main(String[] args) {
		// String code = "123";

		// System.out.println(code.matches("[0-9]{3}"));


		Pattern pattern = Pattern.compile("[0-9]+");
		Matcher matcher = pattern.matcher("Room 12, floor 3");
		while (matcher.find()) {
			System.out.println(matcher.group());
		}
	}
}