class ArrayTask5{
	public static void main(String[] args){
		int len = args.length;
		int[] nums = new int[len];

		for (int i = 0; i < len; i++){
			nums[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < len; i++){
			if (nums[i] < 0){
				nums[i] = 0;
			}
		}

		for (int num : nums) System.out.println(num);

	}
}