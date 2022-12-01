package javapractise1;
/* interface A
 {
	 int a=900;
	 int b=399;
	 void sum();
 }
 class B implements A
 {
	 public void sum()
	 {
		 System.out.println(a+b);
	 }
 }
public class da8_assignment {

	public static void main(String[] args) {
		B b =new B();
		b.sum();

	}

}*/
  interface A
  {
	 int a=300;
	 int b=600;
	 void sum();
  }
  interface B
  {
	  int x=300;
	  int y=300;
	  void mul();
  }
  class calculation implements A,B 
  {
	  public void sum()
	  {
		  System.out.println("THE SUM OF TWO NUMBERS:" + (a+b));
		 
	  }
	  public void mul()
	  {
		  System.out.println("THE MUL OF THE TWO NUMBER:" + (x*y));
	  }
  }  
	  public class da8_assignment 
	  {
		  public static void main(String[] args)
		  {
  	
  		calculation cal =new calculation ();
  		cal.sum();
  		cal.mul();
		  }
	  }
  	