import java.util.Scanner;

public class Task6 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		int num = scanner.nextInt();

		if (num > 0) {
			System.out.println(reverseNumber(num));
		} else {
			System.out.println("Число отрицательное");
			return;
		}
	}

	public static int reverseNumber(int num) {
		int temp = 0;
		int newNumber = 0;
		int c = 0;
		int nNum = num;

		while (num > 0) {
			c++;
			num /= 10;
		}

		while (nNum > 0) {
			temp = nNum % 10;
			c--;
			newNumber += temp * (int) Math.pow(10,c);
			nNum /= 10;
		}

		return newNumber;
	}
}