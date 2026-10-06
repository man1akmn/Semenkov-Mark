import java.util.Scanner;

class Task1{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);
		System.out.print("Введите возраст: ");
		int age = scanner.nextInt();
		String res = (age >= 18) ? "Доступ разрешен" : "Доступ запрещен";

		System.out.println(res);
	}
}