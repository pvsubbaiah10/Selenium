package Arrays;

import java.util.HashSet;
import java.util.Set;

public class CommonElements {

	public static void main(String[] args) {
		int[] arr1 = { 1, 2, 3, 4, 5 };
		int[] arr2 = { 3, 4, 5, 6, 7 };

		Set<Integer> set = new HashSet<>();
		Set<Integer> common = new HashSet<>();
		
		
		for(int a:arr1) {
			set.add(a);
		}
		
		
		for(int b:arr2) {
			if(set.contains(b)) {
				common.add(b);
			}
		}
		
		
		System.out.println(common);

	}

}
