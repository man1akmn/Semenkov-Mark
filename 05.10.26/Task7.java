import java.util.Scanner;

class Task7{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.print("Введите ваш балл: ");
		int inp = scanner.nextInt();

		if (inp > 100) {
			System.out.println("Нет такого балла");
			return;
		}

		System.out.print("Ваша оценка - ");
		int grade = (90 <= inp && inp <= 100) ? 5 : (75 <= inp && inp < 90) ? 4 : (60 <= inp && inp < 75) ? 3 : 2;
		System.out.println(grade);
		
	}
}