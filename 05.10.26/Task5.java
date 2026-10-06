import java.util.Scanner;

class Task5{
	public static void main(String[] args){
		Scanner scanner = new Scanner(System.in);

		System.out.println("1. Поздороваться\n2. Показать случайное число\n0. Выйти");
		int ent;
		do {
			int rand = (int)(Math.random()*101);
			ent = scanner.nextInt();

			switch(ent){
			case 0:
				System.out.println("Вы вышли из цикла.");
				break;
			case 1:
				System.out.println("Привет!!!");
				break;
			case 2:
				System.out.println("Рандомное число от 1 до 100: " + rand);
				break;
			default:
				System.out.println("Неизвестная команда");
			}
		} while (ent > 0);
	}
}