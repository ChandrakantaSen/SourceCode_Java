public class pattern
{
    public static void main(String args[])
    {
        int i,j;
        System.out.println("     1");
        for(i=1;i<=5;i++)
        {
            for(j=1;j<=5-i;j++)
            {
                System.out.print(' ');
            }
            for(j=1;j<=i;j++)
            {
                System.out.print(j);
            }
            for(j=i+1;j>=1;j--)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
        
            
        