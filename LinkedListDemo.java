package collectiondemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {

	public static void main(String[] args) {
		//Declare the linked list
		//LinkedList l=new LinkedList();
		// LinkedList <Integer> l=new LinkedList<Integer> (); // only for the integer type
		//LinkedList <String> l =new LinkedList<String>(); // only for the String
		
		LinkedList l=new LinkedList(); //Heterogeneous
		//Add elements to the linked List
		l.add(100);
		l.add("Raja");
		l.add(15.5);
		l.add('a');
		l.add(null);
		l.add(true);
		// Read elements from LinkedList
		System.out.println(l);// [100, Raja, 15.5, a, null, true]
		// Size of the linked list
		
		System.out.println(l.size());//6
		l.remove(3); //With index
		System.out.println("After removing elements from array:" +l); //[100, Raja, 15.5, null, true]
		System.out.println(l.size());
		
		//Inserting /adding elements /Objects to linkedList
		l.add(3,"Venkateswarlu");
		System.out.println("After adding  elements to Linkedlist:" +l);//[100, Raja, 15.5, Venkateswarlu, null, true]
	    System.out.println(l.size());//6
	    // Retriving the Elements/objects
	    System.out.println(l.get(3));//Venkateswarlu
	    //Replace the value/elements/objects
	    l.set(3, "Karravula");
	    System.out.println("After replacing the values:" +l);//100, Raja, 15.5, Karravula, null, true
	    //Contains method it returnd true/false
	    l.contains("Karravula");
	    System.out.println(l.contains("Karravula"));//true
	    System.out.println(l.contains("gumma"));//false
	    
	    // Verify linked list is Empty or Not
	    System.out.println(l.isEmpty());//false
	    
	    // READ THE DATA FROM LINKED LIST IN \MULTIPLE WAYS
	    
	    /* for(int i=0;i<l.size();i++)
	     {
	    	System.out.println(l.get(i));
	     } */
	    
	    //Read the elements Using for each loop...
	   /* for(Object e:l)
	    {
	    	System.out.println(e);
	    }*/
	    
	    //iterator() Method
	    Iterator it=l.iterator();
	    while(it.hasNext())
	    {
	    	System.out.println(it.next());
	    }
	    		
	    
	    
	    
	    
	    
		
		
	}

}
