import java.util.*;
class Palindrome
{
    public static void main(String args[])
    {
        scanner in=new scanner(System.in);
        int n,p,d,r=0;
        System.out.println("Hey U Enter A Number");
        n=in.nextINT();
        p=n;
        do
        {
            d=n%10;
            r=r*10+d;
            n=n/d;
        }
        While(n!=10);
       if(r==p)
        System.out.println("It is a Palindrome Number");
        else
        System.out.println("It is not a Palindrome Number");
    }
}
    