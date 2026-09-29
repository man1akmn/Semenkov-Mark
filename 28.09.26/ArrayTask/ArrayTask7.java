class ArrayTask7{
	public static void main(String[] args){
		int len = args.length;
		int[] nums = new int[len];
		int[] newNums = new int[len];

		for (int i = 0; i < len; i++){
			nums[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < len; i++) {
			newNums[i] = nums[len-i-1];
		}

		for (int num : newNums) System.out.println(num);
	}
}