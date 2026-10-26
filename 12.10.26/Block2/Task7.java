import java.util.Scanner;

public class Task7 {
	public static void main(String[] args) {
		int[] arr = {3,7,10};
		int ind = 2;

		for (int i = 0; i <= ind; i++) {
			System.out.println(sumArr(arr, i));
		}
	}

	public static int sumArr(int[] arr, int ind){
		if (arr.length == ind) {
			return 0;
		} else if (ind < 0) {
			return 0;
		}

		return arr[ind] + sumArr(arr, ind+1);
	}
}