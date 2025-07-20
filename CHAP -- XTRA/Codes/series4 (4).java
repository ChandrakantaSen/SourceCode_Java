import java.util.*;
class series4
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int a=1,n,i;double s=0.0;
        System.out.println("enter the number");
        n=in.nextInt();
        for(i=1;i<=n;i++)
        {
            s=s+Math.pow(i,i)/a;
            a=a+20;
        }
        System.out.print(s+" ");
    }
}
        
        
