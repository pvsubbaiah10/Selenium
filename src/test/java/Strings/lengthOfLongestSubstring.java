package Strings;

public class lengthOfLongestSubstring {

	public static void main(String[] args) {

		String s = "abcabcbb";
		String current = "";
		int max = 0;
		String longest = "";

		for (char ch : s.toCharArray()) {
			if (current.indexOf(ch) != -1) {
				current = current.substring(current.indexOf(ch) + 1);
			}
			current += ch;
			max = Math.max(max, current.length());

			if (current.length() > longest.length()) {
				longest = current;
			}

		}

		System.out.println(max);
		System.out.println("Longest substring: " + longest);

	}
}
