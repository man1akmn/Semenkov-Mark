import java.util.Scanner;

class Task4{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		int a,b;
		System.out.print("Введите первое число: ");
		a = scanner.nextInt();
		System.out.print("Введите второе число: ");
		b = scanner.nextInt();

		System.out.print("Введите операцию: ");
		String operation = scanner.next();

		switch(operation){
		case "*":
			System.out.println(a + b);
			break;
		case "-":
			System.out.println(a - b);
			break;
		case "*":
			System.out.println(a * b);
			break;
		case "/":
			System.out.println((b != 0) ? (a / b) : "На 0 делить нельзя.");
			break;
		default:
			System.out.println("Неизвестная операция.");
		}
	}
}