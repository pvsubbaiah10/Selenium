package Strings;

public class PrintDoubleLetters {

	public static void main(String[] args) {

		String s = "hello";

		//
		String res = "";

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);

			res = res + ch + ch;
		}

		System.out.println(res);

		// using Stringbuilder

		StringBuilder sb = new StringBuilder();

		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			sb.append(ch).append(ch);
		}

		System.out.println(sb);

	}

}
