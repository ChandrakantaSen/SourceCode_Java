import java.util.*;
class palindrom
{
    public static void main(String args[])
    {
        Scanner in=new Scanner(System.in);
        int s=0,n,n1,r=0;
        System.out.println("enter the number");
        n=in.nextInt();
         n1=n;
        while(n>0)
        {
            r=(n%10);
            n=(n/10);
            s=(s*10)+r;
        }
        if(s==n1)
        System.out.println("the number is a palindrom");
    }
}

        
