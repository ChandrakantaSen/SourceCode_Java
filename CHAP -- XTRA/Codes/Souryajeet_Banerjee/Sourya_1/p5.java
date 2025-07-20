public class p5
{
    void main()
    {
        int n=3;
        for(int i=n;i>=1;i=i-2)
        {
            System.out.println();
           for(int j=1;j<=i;j++)
           {  
               System.out.print("@");
           }
        }
        System.out.print(" ");
        for(int i=1;i<=n;i=i+2)
        {
           for(int j=1;j<=i;j++)
           {  
               System.out.print("@");
           }
            System.out.println();
        }
    }
}