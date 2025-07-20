import java.util.*;
class twinprime
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int n,n1,i,j,c=0,c1=0;
        System.out.println("enter the value of the first number");
        n=in.nextInt();
        System.out.println("enter the value of the second number");
        n1=in.nextInt();
        for(i=2;i<n;i++)
        {
            if(n%i!=0)
            {
                c=1;
            }
            else
            {
                c=2;
            }
        }
        for(j=2;j<n1;j++)
        {
            if(n1%j!=0)
            {
                c1=1;
            }
            else
            {
                c=2;
            }
        }
        if(n1-n==2 && c==1 && c1==1)
        {
         System.out.println("twin prime number");
        }
        else
        {
            System.out.println("not twin prime numbers");
    }
}
}
