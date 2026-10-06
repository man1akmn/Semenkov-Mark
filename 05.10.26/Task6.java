import java.util.Scanner;

class Task6{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		String password;
		do {
			System.out.print("Введите пароль: ");
			password = scanner.next();
			System.out.println((password.equals("java123") == true) ? "Вход выполнен." : "Не правильный пароль. Попробуйте еще раз.");
		} while (password.equals("java123") != true);
	}
}