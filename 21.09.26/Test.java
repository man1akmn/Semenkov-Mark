import java.util.Scanner;
class Test{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		int pin;
		int attempt = 3;
		
		while (attempt > 0){
			System.out.println("Введите PIN-код:");
			pin = scanner.nextInt();

			if (pin == 1234){
				System.out.println("Доступ разрешен.");
				break;
			}

			attempt--;

			System.out.println(
				attempt > 0
				? "У вас остлось " + attempt + " попыток"
				: "PIN-код не подошел. Попробуйте чуть позже"
			);
		}
	}
}