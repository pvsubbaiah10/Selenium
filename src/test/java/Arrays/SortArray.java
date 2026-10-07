package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = { 5, 2, 9, 1, 3 };

		// using method

		Arrays.sort(arr);

		for (int a : arr) {
			System.out.print(a);
		}

		System.out.println();
		// with out method

		for (int i = 0; i < arr.length; i++) {

			int m = i;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[m]) {
                   m=j;
				}
			}
			
			int temp=arr[i];
			arr[i]=arr[m];
			arr[m]=temp;
			
		}
		
		for(int num:arr) {
			System.out.print(num);
		}
		
		
		//sort array list
		
		System.out.println();
		ArrayList<Integer> list = new ArrayList<>(Arrays.asList(5, 2, 9, 1, 3));
		
		
		for(int i=0;i<list.size();i++) {
			
			for(int j=i+1;j<list.size();j++) {
				if(list.get(i)>list.get(j)) {
					int t=list.get(i);
					list.set(i, list.get(j));
					list.set(j, t);
				}
			}
		}
		
		System.out.println(list);


	}

}
