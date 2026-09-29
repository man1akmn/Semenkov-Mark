class ArrayTask1{
	public static void main(String[] args){
		int[] num = new int[args.length];

		for (int i = 0; i < args.length; i++){
			num[i] = Integer.parseInt(args[i]);
		}

		for (int i : num) System.out.println(i);
	}
}