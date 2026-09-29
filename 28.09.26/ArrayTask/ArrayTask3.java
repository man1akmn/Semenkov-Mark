class ArrayTask3{
	public static void main(String[] args){
		int[] num = new int[args.length];
		int max = 0;

		for (int i = 0; i < args.length; i++){
			num[i] = Integer.parseInt(args[i]);
		}

		for (int i = 0; i < args.length; i++){
			if (num[i] > max)
				max = num[i];
		}

		System.out.println(max);
	}
}