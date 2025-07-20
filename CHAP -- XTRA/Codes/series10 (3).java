import java.util.*;
class series10
{
    public static void main(String args[])
    {
        int i,n,a;
        double s=0.0;
     
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        System.out.println("enter the value of a");
        a=in.nextInt();
        for(i=1;i<=n;i++)
        {
           s=s+Math.pow(a,i)/i;
        }
        System.out.print(" "+s);
    }
}

