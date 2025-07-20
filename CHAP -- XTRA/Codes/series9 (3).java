import java.util.*;
class series9
{
    public static void main(String args[])
    {
        int i,j=1,a,n;
        double p=0.0,l,s=0.0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        System.out.println("entre the value of a");
        a=in.nextInt();
        for(i=1;i<=n;i=i+2)
        {
           l=Math.pow(a,i);
           p=(double)l/j;
           if(i%2==0)
           {
              s=s-p;
            }
            else
            {
                s=s+p;
            }
             j=j+4;
        }
       System.out.print(" "+s);
    }
}
        