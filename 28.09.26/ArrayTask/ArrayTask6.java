class ArrayTask6{
	public static void main(String[] args){
		int len = args.length;
		int[] nums = new int[len];
		int target = Integer.parseInt(args[len-1]);

		for (int i = 0; i < len-1; i++){
			nums[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < len-1; i++){
			if (nums[i] == target){
				System.out.println("Число есть в массиве.");
				return;
			}
			else {
				System.out.println("Числа нет в массиве.");
				return;
			}
		}
	}
}