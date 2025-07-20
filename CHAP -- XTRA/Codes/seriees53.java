import java.util.*;
class seriees53
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int i,j=0,k=0,s=1,l=0,n;
        System.out.println("enter the number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
           j=k+i;
            l=s*i;
        }
        double m=j/l;
        System.out.println("the answer is"+m);
    }
}
        
