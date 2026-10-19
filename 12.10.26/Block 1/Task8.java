public class Task8 {
	public static void main(String[] args) {
		int size = Integer.parseInt(args[0]);

		for (int i = 1; i <= size; i++) {
			for (int j = 1; j <= size; j++) {
				System.out.println(i * j + "\t");
			}
			System.out.println();
		}
	}
}