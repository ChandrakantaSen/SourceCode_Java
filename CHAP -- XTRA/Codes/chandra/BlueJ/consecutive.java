import java.util.*;
class consecutive
{
    public static void main(String args[])
    {
        int n,s,t;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number: ");
        n = in.nextInt();
        
        for(int i=1;i<n;i++)
        {
            for(int j=i;j<=n;j++)
            {
                s=0;
                for(int k=i;k<=j;k++)
                {
                    s=s+k;
                }
                if(s==n)
                {
                    for(t=i;t<=j;t++)
                    {
                        System.out.print(" "+t);
                    }
                    System.out.println();
                }
            }
        }
    }
}