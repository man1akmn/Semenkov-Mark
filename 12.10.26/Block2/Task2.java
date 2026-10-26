import java.util.Scanner;
public class Task2 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int n = scanner.nextInt();
		System.out.println(sumN(n));
	}

	public static int sumN(int n) {
		if (n < 1)
			return 0;

		return n + sumN(n - 1);
	}
}