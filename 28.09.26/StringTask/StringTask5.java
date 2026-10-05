class StringTask5{
	public static void main(String[] args){
		String text = args[0];
		String newString = "";

		
		for (int i = 0; i < args[0].length(); i++){
			char c = text.charAt(i);
			if (c != ' '){
				newString += c;
			}
		}

		System.out.println(newString);
	}
}