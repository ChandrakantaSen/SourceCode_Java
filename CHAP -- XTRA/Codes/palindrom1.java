import java.util.*;
class palindrom1
{
    public static void main(String args[])
    {
        int r,n,n1,s=0;
        Scanner in=new Scanner(System.in);
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
        System.out.println("it is a palindrom" );
        else
        System.out.println("it is not a palindrom");
    }
}
        
