import java.util.*;
class rec_rev
{
    String s="",rev="";
    void getdata()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string");
        s=sc.next();
        int l=s.length();
        recReverse(l);
    }
    void recReverse(int n)
    {
        if(n>0)
        {
            rev=rev+s.charAt(--n);
            recReverse(n);
        }
    }
    void check()
    {
        if((s.equalsIgnoreCase(rev))==true)
        {
            System.out.println("Palindrome");
        }
        else
        {
            System.out.println("Not Palindrome");
        }
    }
}