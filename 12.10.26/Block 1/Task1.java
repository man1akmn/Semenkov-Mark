import java.util.Scanner;

class Task1 {
	static int power(int base, int exponent) {
		int pow = base;
		for (int i = 1; i < exponent; i++) {
			base *= pow;
		}

		return base;
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int base = scanner.nextInt();
		int exponent = scanner.nextInt();

		System.out.println(power(base,exponent));
	}
}