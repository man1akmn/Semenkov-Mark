class ArrayTask2{
	public static void main(String[] args){
		int[] num = new int[args.length];
		int sum = 0;

		for (int i = 0; i < args.length; i++){
			num[i] = Integer.parseInt(args[i]);
		}

		for (int i : num){
			sum += i;
		}

		System.out.println(sum);
	}
}