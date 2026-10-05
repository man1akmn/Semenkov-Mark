class StringTask5{
	public static void main(String[] args){
		String text = args[0];
		String newString = "";
		for (int i = 0; i < text.length(); i++){
			char c = text.charAt(i);
			if (c != ' '){
				newString += text.charAt(i);
			}
		}

		System.out.println(newString);
	}
}