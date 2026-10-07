package Strings;

public class PERMUTATION {
	 static int c = 0;
	public static void main(String[] args) {
		String str = "abc";
		permute(str, "");
		System.out.println("Total permutations = " + c);
	}

	static void permute(String str, String prefix) {
		if (str.length() == 0) {
			System.out.println(prefix);
			c++;
		} else {
			for (int i = 0; i < str.length(); i++) {
				String rem = str.substring(0, i) + str.substring(i + 1);
				permute(rem, prefix + str.charAt(i));
			}
		}
	}
}
