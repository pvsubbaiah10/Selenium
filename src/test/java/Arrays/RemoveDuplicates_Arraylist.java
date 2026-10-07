package Arrays;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicates_Arraylist {

	public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>(Arrays.asList(1,2,2,3,4,4,5));
        
        
        ArrayList<Integer> unique = new ArrayList<>(); 
        ArrayList<Integer> d = new ArrayList<>();

        for (Integer num : list) {
            if (!unique.contains(num)) {
                unique.add(num);
            }else {
            	d.add(num);
            }
        }

        System.out.println(unique);
        System.out.println(d);

	}

}
