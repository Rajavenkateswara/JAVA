package collectiondemo;

import java.util.Collections;
import java.util.LinkedList;

public class LinkedlistDemo2 {

	public static void main(String[] args) {
		// MULTIPLE OBJECTS AND MULTIPLE ELEMENTS TO LINKEDLIST
		LinkedList l1=new LinkedList();
		//LinkedList<String> l1=new LinkedList<String>();
		//LinkedList<Integer> l2=new LinkedList<Integer>();
		// sorting and shuffling possible only same kind of data
		
		l1.add("x");
		l1.add("u");
		l1.add("w");
		l1.add("z");
		l1.add("1");
		l1.add("4");
		l1.add("5");
		
		LinkedList l2=new LinkedList();
		l2.addAll(l1);
		System.out.println(l2);//[x, u, w, z, 1, 4, 5]
		
		l2.removeAll(l1);
		System.out.println(l2);//[]
		
		//sorting  sort()
		//collections.sort(collection)
		System.out.println("BEFORE SORTING:"+l1);//[x, u, w, z, 1, 4, 5]
		Collections.sort(l1);
		System.out.println("Afeter sorting:" +l1);//[1, 4, 5, u, w, x, z]
		
		//Reversing Order
		System.out.println("Before reversing :" +l1);//[1, 4, 5, u, w, x, z]
		Collections.sort(l1,Collections.reverseOrder());
		System.out.println("After reversing:"+l1);//[z, x, w, u, 5, 4, 1]
		
		//shuffling
		Collections.shuffle(l1);
		System.out.println(l1);//[4, u, w, z, 1, 5, x]
		

	}

}
