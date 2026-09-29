class ArrayTask4{
	public static void main(String[] args){
		int[] nums = new int[args.length];
		int c = 0;

		for (int i = 0; i < args.length; i++){
			nums[i] = Integer.parseInt(args[i]);
		}

		for (int num : nums){
			if (num % 2 == 0){
				c++;
			}
		}

		System.out.println(c);
	}
}