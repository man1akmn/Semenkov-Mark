import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();

		printUp(n);
	}

	public static void printUp(int n) {
		if (n < 1) {
			return;
		} else {
			printUp(n-1);
			System.out.println(n);
		}
	}
}