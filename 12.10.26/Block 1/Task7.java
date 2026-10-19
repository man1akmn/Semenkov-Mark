import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num1 = scanner.nextInt();

		System.out.println(palindromNumber(num1));
	}

	public static boolean palindromNumber(int a) {
		int b = Task6.reverseNumber(a);
		if (a == b)
			return true;
		else
			return false;
	}
}