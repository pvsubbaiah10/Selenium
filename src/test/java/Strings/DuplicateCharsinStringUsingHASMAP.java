package Strings;

import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import java.util.TreeSet;

public class DuplicateCharsinStringUsingHASMAP {

	public static void main(String[] args) {

		String input = "Programming";

		// using hash map
		Map<Character, Integer> map = new HashMap<>();

		for (char ch : input.toCharArray()) {
			if (ch == ' ')
				continue;
			map.put(ch, map.getOrDefault(ch, 0) + 1);
		}
		// System.out.println(map);

		for (Map.Entry<Character, Integer> mapkv : map.entrySet()) {
			if (mapkv.getValue() >= 1) {

				System.out.println(mapkv.getKey() + "-->" + mapkv.getValue());

			}
		}

		System.out.println();

		// with out HASHMAP

		for (int i = 0; i < input.length(); i++) {

			int c = 1;

			for (int j = i + 1; j < input.length(); j++) {

				if (input.charAt(i) == input.charAt(j)) {
					c++;
				}
			}

			int k;

			for (k = 0; k < i; k++) {
				if (input.charAt(i) == input.charAt(k)) {
					break;

				}
			}

			if (k == i) {
				System.out.println(input.charAt(i) + "--" + c);
			}
		}

	}

}
