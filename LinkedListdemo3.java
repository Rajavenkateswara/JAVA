package collectiondemo;

import java.util.LinkedList;

public class LinkedListdemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList l=new LinkedList();
		 l.add("dog");
		 l.add("dog");
		 l.add("monkey");
		 l.add("cat");
		 l.add("horse");
		 System.out.println(l);
		 
		 l.addFirst("pig");
		 l.addLast("Tiger");
		 System.out.println("after adding elements in  first and last " +l);
		 System.out.println(l.getFirst());
		 System.out.println(l.getLast());
		 System.out.println("After removing the elements:"+l);
		 l.removeFirst();
		 l.removeLast();
		 System.out.println("Removing the first and last elements:"+l);
		 
		 	
	}

}
