package Arrays;

import java.util.Map;

import org.apache.commons.collections4.map.HashedMap;

public class OccuranceofNumbersInArray {

	public static void main(String[] args) {

		int[] arr = { 2, 2, 3, 4, 5, 6, 5, 3, 9, 5 };

		// using Hash MAP

		Map<Integer, Integer> map = new HashedMap<Integer, Integer>();

		for (int n : arr) {

			map.put(n, map.getOrDefault(n, 0) + 1);

		}

		// System.out.println(map);

		for (Map.Entry<Integer, Integer> m : map.entrySet()) {
			if (m.getValue() >= 1) {
				System.out.println(m.getKey() + " ----> " + m.getValue());
			}
		}

		
		System.out.println();
		// with out Hash Map

		for (int i = 0; i < arr.length; i++) {

			int c = 1;

			for (int j = i + 1; j < arr.length; j++) {
				if (arr[i] == arr[j]) {
					c++;
				}
			}

			int k;

			for (k = 0; k < i; k++) {
				if (arr[i] == arr[k]) {
					break;
				}
			}
			
			if(k==i) {
				System.out.println(arr[i]+" ----> "+ c);
			}

		}

	}

}
