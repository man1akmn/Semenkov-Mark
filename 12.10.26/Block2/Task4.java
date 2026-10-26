import java.util.Scanner;

public class Task4 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		printDown(n);
	}

	public static void printDown(int n) {
		if (n < 1) {
			return;
		}
		else {
			System.out.println(n);
			printDown(n-1);
		}
	}
}