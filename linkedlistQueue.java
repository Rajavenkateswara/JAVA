package collectiondemo;

import java.util.LinkedList;

public class linkedlistQueue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList q=new LinkedList();
		
		q.add("raja");
		q.add(123);
		q.add(200);
		q.add(null);
		q.add(123);
		System.out.println(q);
		
		//System.out.println(q.element());//NoSuchElementException
		//System.out.println(q.peek());//NULL
		
		//	REMOVE AND RETURN THE VALUE (REMOVE VALUES FORM THE QUEUE
			//System.out.println(q.remove());
			//System.out.println(q);
			System.out.println(q.poll());
			System.out.println(q);
			
	
	}

}
