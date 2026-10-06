import java.util.Scanner;

class ScannerBlock1{
	public static void main(String[] args){
		// тернарный оператор
		// int a,b;
		// a = 5;
		// b = 12;
		// System.out.println((a + b) == 17 ? "ok" : "no ok");



		// switch case
		// int day = 3;

		// switch (day){
		// case 2:
		// 	System.out.println("tuesday");
		// 	break;
		// case 3:
		// 	System.out.println("wednesday");
		// 	break;
		// default:
		// 	System.out.println("another day");
		// }



		// do while
		// int c = 0;
		// do {
		// 	System.out.println(c);
		// 	c++;
		// } while (c < 2);



		// Scanner
		// int
		// Scanner scanner = new Scanner(System.in);
		// System.out.print("Enter age: ");
		// int age = scanner.nextInt();
		// System.out.print("Your age:" + age);

		// Str
		Scanner scanner = new Scanner(System.in);
		String str1 = scanner.next();
		String str2 = scanner.nextLine();

		System.out.println("Str1: " + str1);
		System.out.print("Str2: " + str2);


	}
}