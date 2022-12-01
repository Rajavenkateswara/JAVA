package collectiondemo;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetCollectionDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet hs=new HashSet(); //Default capacity 16 and load factors ->0.75
		//HashSet hs=new HashSet(100);//intial capacity is 100
		//HashSet hs =new HashSet(100,(float)0.90);
		//HashSet<Integer> hs=new HashSet<Integer>();
		
		// Add objects or elements into HASHSET
		hs.add(100);
		hs.add("welcome");
		hs.add(16.4);
		hs.add('A');
		hs.add(true);
		hs.add(null);
		 System.out.println(hs);//[null, A, 100, 16.4, welcome, true]-insertion order  not preserve
		 hs.remove(16.4);//value
		 System.out.println("after removing elements:" +hs);//[null, A, 100, welcome, true]
		//contains()
		 System.out.println(hs.contains("welcome"));//true
		 System.out.println(hs.contains("Welcome"));//false
		 //isEmpty
		System.out.println( hs.isEmpty());//false
		
		//Reading the elements /objects from the Hashset by using for loop
		System.out.println("reading the elements from the Hashlist");
		/*for(Object e:hs)
		{
			System.out.println(e);
		}*/
		
		Iterator it=hs.iterator();
		/*while(it.hasNext())
		{
			System.out.println(it.next());
		}*/
		
		/*for(int i=0;i<hs.size();i++)
		{
			System.out.println(hs.g);
		}*/
		
		
		 
			
				
		
		

	}

}
