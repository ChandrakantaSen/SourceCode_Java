import java.util.*;
class series
{
    public static void main(String args[])
    {
        int n,i,a,b,c=0;
        Scanner in=new Scanner(System.in);
        System.out.println("enter the number");
        n=in.nextInt();
        a=0;
        b=1;
        System.out.println(a+b);
        for(i=1;i<n-2;i++)
        {
            c=a+b;
            System.out.println(c);
            a=b;
            b=c;
        }
    }
    }
