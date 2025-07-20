import java.util.*;
class amicable_pair
{
    public static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter lower range");
        int m=sc.nextInt();
        System.out.println("Enter upper range");
        int n=sc.nextInt();
        int i,j,v=0;
        amicable_pair obj=new amicable_pair();
        for(i=m;i<=n;i++)
        {
            j=obj.amicable(i);
            for(int s=1;s<j;s++)
            {
                if(j%s==0)
                {
                    v+=s;
                }                   
            }
            if(v==i)
            {
                System.out.println(i+","+j);
            }
            v=0;
        }
    }
    int amicable(int n)
    {
        int i,c=0;
        for(i=1;i<n;i++)
        {
            if(n%i==0)
            {
                c=c+i;
            }
        }
        return c;
    }
}
            