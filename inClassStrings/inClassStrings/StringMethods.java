package inClassStrings;

public class StringMethods {

	public static void main(String[] args) {
		String str = "123abAC/$";
		
		System.out.printf("%s\n", toUpperCase(str));

		
	}
	
	public static String toUpperCase(String str) {
		char letter = ' ';
		String upper = "";
		
		for (int i = 0; i < str.length(); i++) {
			letter = str.charAt(i);
			
			if ((int)letter >= 97 && (int)letter <= 122) {
				letter = (char)((int)letter - 32);
			}
			
			upper = upper + letter;
		}
		
		return upper;
	}
	
	public static String subString(String str, int beginIndex, int endIndex) {
		
		return null;
	}

	public static char[] toCharArray(String str) {
		
		return null;
	}
	
	public static String[] split(String str,char delim) {
		
		return null;
	}
}
