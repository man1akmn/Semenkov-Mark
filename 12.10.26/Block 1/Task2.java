import java.util.Scanner;

class Task2 {
	public static int gcd(int a, int b) {
		int res = 0;
		int q; int r = 1;

		while (r > 0) {
			q = a / b;
			r = a % b;
			a = b * q + r;
			a = b;
			res = b;
			b = r;
		}
		return res;
	}

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(gcd(a, b));
	}

}