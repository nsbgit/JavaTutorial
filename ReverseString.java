public class ReverseString {
	
	static String s= "My name is Sukanta Sharma.";
	static StringBuffer str = new StringBuffer(s);
	public static void main(String[] args) {
		int i = 0, start = i;
		
		System.out.println("Input String : " + s);
		
		// reverse individual words
		while(i < str.length()) {
			if (str.charAt(i) == ' ' || i == str.length() - 1) {
				if (i == str.length() - 1) { // last character
					reverse(start, str.length() - 1);
				}
				else {
					reverse(start, i-1);
					start = i + 1;
				}
			}
			i++;
		}
		System.out.println("Word reverse : " + str);
		
		// reverse the whole string
		reverse(0, str.length() - 1);
		System.out.println("String reverse : " + str);
	}
	
	public static void reverse(int start, int end) {
		while (start < end) {
			char temp;
			temp = str.charAt(start);
			str.setCharAt(start, str.charAt(end));
			str.setCharAt(end, temp);
			start++;
			end--;
		}
	}
}