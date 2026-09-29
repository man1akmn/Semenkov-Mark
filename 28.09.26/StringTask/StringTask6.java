class StringTask6{
	public static void main(String[] args){
		String word = args[0];
		boolean flag = true;

		for (int i = 0; i < word.length()/2; i++) {
			if (word.charAt(i) != word.charAt(word.length()-i-1)){
				flag = false;
				break;
			}
		}

		System.out.println(flag);
	}
}