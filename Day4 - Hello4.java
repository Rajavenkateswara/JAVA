
/**

        this is the java course by
        Navin Reddy on Telusko Channel

 */


class Hello4
{
    public static void main(String args[])
    {
        int i = 1;
//        do
//        {
//            System.out.print(i + " ");          // 5 4 3 2 1
//            i++;
//        }while(i<=5);

        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=4;j++)
            {
                if(i==1 || i==4 || j==1 || j==4)
                    System.out.print("* ");
                else
                    System.out.print("  ");

            }
            System.out.println();
        }


    }
}