package Arrays;

import java.util.ArrayList;

public class Find_First_and_Last_Element_of_Arraylist {

	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<>();
		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);

		// First element
		int first = list.get(0);

		// Last element
		int last = list.get(list.size() - 1);

		System.out.println("First element: " + first);
		System.out.println("Last element: " + last);

	}

}
