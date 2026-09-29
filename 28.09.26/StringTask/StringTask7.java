class StringTask7{
	public static void main(String[] args){
		int c = 0;
		String word = args[0];
		char[] letters = {'a','e','i','o','u'};

		for (int i = 0; i < word.length(); i++){
			for (int j = 0; j < letters.length; j++) {
				if (word.charAt(i) == letters[j])
					c++;
			}
				
		}
		System.out.println(c);
	}
}