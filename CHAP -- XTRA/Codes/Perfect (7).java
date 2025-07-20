import java.util.*;
class Perfect
{
    int n;
    Perfect()
    {
        n=0;
    }
    Perfect(int nn)
    {
        n=nn;
    }
    void perfect_sq()
    {
        System.out.println("The first 5 perfect squares greater than "+n+" are :");
        int sq=(int)(Math.sqrt(n));
        for(int i=sq+1;i<=sq+5;i++)
        System.out.println(i*i);
    }
    void sum_of()
    {
        String comb="";
        int sum=0,j=0;
        System.out.println(n+" is a sum of :");
        for(int i=1;i<=n-1;i++)
        {
            j=i;
            while(sum<n)
            {
                sum+=j;
                comb=comb+j+" ";
                j++;
            }
            if(sum==n)
            System.out.println(comb);
            sum=0;
            comb="";
        }
    }
    static void main()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number :");
        Perfect ob=new Perfect(sc.nextInt());
        ob.perfect_sq();
        ob.sum_of();
    }
}