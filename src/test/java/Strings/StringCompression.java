package Strings;

public class StringCompression {

	public static void main(String[] args) {
		String str = "aabbcc";
		StringBuilder result = new StringBuilder();

		int c = 1;

		for (int i = 0; i < str.length(); i++) {
			if (i + 1 < str.length() && str.charAt(i) == str.charAt(i + 1)) {
				c++;

			} else {
				result.append(str.charAt(i)).append(c);
				c = 1;
			}

		}
		System.out.println(result);
	}

}
