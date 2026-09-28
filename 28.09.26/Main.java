class Main{
	public static void main(String[] args){
		/*System.out.println("hello world");

		int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);

		System.out.println(a + b);*/

		//1 task
		/*int a = Integer.parseInt(args[0]);
		boolean flag = false;

		if (a % 2 == 0) flag = true;
		else flag = false;

		System.out.println(flag);*/


		//2 task
		/*int a = Integer.parseInt(args[0]);
		boolean flag = false;

		if (a > 0) System.out.println("Число положительное");
		else if (a < 0) System.out.println("Число отрицательное");
		else System.out.println("число равно нулю");*/


		//3 task
		/*int age = Integer.parseInt(args[0]);
		boolean hasPasport = Boolean.parseBoolean(args[1]);

		if (age >= 18 && hasPasport == true)
			System.out.println("Вход разрешен");
		else
			System.out.println("Вход запрещен");*/


		//4 task
		/*int a = Integer.parseInt(args[0]);
		int b = Integer.parseInt(args[1]);
		int c = Integer.parseInt(args[2]);

		if (a > b && a > c) System.out.println(a);
		if (b > a && b > c) System.out.println(b);
		if (c > b && c > a) System.out.println(c);*/


		//5 task
		int n = Integer.parseInt(args[0]);
		int sum = 0;

		if (n < 0){
			System.out.println("Число отрицательное. Введите положительное");
			return;
		}

		for (int i = 0; i <= n; i++){
			sum += i;
		}
		System.out.println(sum);

	}
}