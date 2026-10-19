import java.util.Scanner;

class Task3 {
	public static int lcm(int a, int b) {
		return a * b / Task2.gcd(a, b);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int a = scanner.nextInt();
		int b = scanner.nextInt();

		System.out.println(lcm(a, b));
	}
}