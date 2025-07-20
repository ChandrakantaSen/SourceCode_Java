public class fy
{
    void main()
    {
        int n=5,s=1;
        for(int i=1;i<=n;i=i+2)
        {
           for(int g=n-i+1;g>=1;g=g-2)
           {  
               System.out.print(" ");
           }
           for(int j=1;j<=i;j++)
           {  
               System.out.print(s);
               s=s+1;
           }
            System.out.println();
        }
    }
}