import java.util.Scanner;

class Task2{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите число: ");
		int num = scanner.nextInt();
		String result = (num % 2 == 0) ? "Четное" : "Не четное";
		System.out.println(result);
	}
}