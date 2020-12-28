package com.Core_JAVA_Interview_Questions.CollectionQuestions;

import java.util.Vector;

public class VectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector = new Vector<Integer>(3, 5);

		vector.add(10);

		vector.add(20);

		vector.add(30);

		vector.add(40);

		// again Printing Current Capacity of Vector

		System.out.println(vector.capacity());

		/*
		 * Unlike an ArrayList, you can set the size of the Vector manually. If the new
		 * size is greater than the current size, the new slots will be filled with null
		 * elements. If the new size is smaller than current size, then the extra
		 * elements will be discarded.
		 * 
		 */

		// Setting the size of vector as 10.

		vector.setSize(10);

		// Now retrieving the current size of vector

		System.out.println(vector.size()); // Output : 10

		// Printing the elements of vector. notice that 6 null elements are inserted

		System.out.println(vector); // Output: [10, 20, 30, 40, null, null, null, null, null, null]

		// Again changing the size of vector to 3

		vector.setSize(3);

		// Printing the elements of vector. notice that extra elements are removed.

		System.out.println(vector);   //Output : [10, 20, 30]

	}

}
