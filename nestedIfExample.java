class nestedIfExample
{
 public static void main(String args[])
{
  int a=56,b=89,c=25;
  if(a>b)
   {
     if(a>c)
     {  
       System.out.println("Greater:"+a);
     }
     else
     {
       System.out.println("Greater :"+c);
    }
     }
      else
     {
     System.out.println("Greater: " +b);
      }
     System.out.println("hello");
}
}