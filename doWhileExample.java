public class doWhileExample 
{
  public static void main(String args[])
{ 
 int i=1,sum=0;
  do
{
	 System.out.println(i);
          sum=sum+i;
	  i++;  
}while(i<=20);
System.out.println(sum);
}
}