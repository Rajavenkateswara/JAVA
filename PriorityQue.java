package collectiondemo;

import java.util.PriorityQueue;

public class PriorityQue {

	public static void main(String[] args) {

		PriorityQueue pq=new PriorityQueue();
		
		pq.add("abc");
		pq.add("def");
		pq.add("ghi");
		pq.add("qwe");
		pq.offer("hjhk");
		pq.offer("ghgj");
		//pq.offer("abc");
		System.out.println(pq); //insertion of order preserved and duplicates are allowed
		
		//get head element by using element() & peek()
		//System.out.println(pq.element()); //return the head element and if its empty  returns NoSuchElementException
		//System.out.println(pq.peek());// it return the head element and if its empty returns null
		
		//Return and remove the elements from queue
		//System.out.println(pq.remove());
		//System.out.println(pq.poll());
		//System.out.println(pq);
		
		System.out.println(pq.poll());
		System.out.println(pq);
		
		System.out.println(pq.size());
		
	}

}
