package javapractise1;

public class Day2_assignment {

	public static void main(String[] args) {
		
		// find the given number is postive or negative
		/*int num=-1;
		if(num>=0)
		{
			System.out.println("The number is positive");
		}
		else
		{
			System.out.println("The number is Negative");
		}*/
		
	// find the greatest of the three numbers
		/*int a=100;
		int b=200;
		int c=300;
		if(a>b && a>c)
		{
			System.out.println("a is the greatest munber;"+ a);
		}
		else if(b>c)
		{
		System.out.println("b is the greatest number:" + b)	;
		}
		else {
			System.out.println("c is the greatest number:" +c);
		} */
		
		//Multiplication table 
		/* int num=12;
	
		for(int i=0;i<=10;i++)
		{

			System.out.println(num +"*"+ i +"="+ num*i );
		} */
		//Cont the number of digites number
		
				int num=123;
				int i=0;
				while(num!=0)
				{
					num/=10;
					i++;
				}
				System.out.println("The number of digits of the number;" +i);

	}

}
