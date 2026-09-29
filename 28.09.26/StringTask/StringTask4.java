class StringTask4{
	public static void main(String[] args){
		String text = args[0];
		int sum = 0;
		for (int i = 0; i < text.length(); i++){
			if (text.charAt(i) == 'a'){
				sum++;
			}
		}
		System.out.println(sum);
	}
}