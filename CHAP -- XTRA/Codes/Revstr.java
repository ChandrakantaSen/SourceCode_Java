import java.util.*;
class Revstr
{
    String str,revst;
    void getStr()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the string :");
        str=sc.next();
        revst="";
    }
    void recReverse(int n)
    {
        if(n>=0)
        {
            revst+=str.charAt(n);
            recReverse(n-1);
        }
    }
    void check()
    {
        recReverse(str.length()-1);
        System.out.println("Original String :"+str);
        System.out.println("Reversed String :"+revst);
        if(str.equalsIgnoreCase(revst))
        System.out.println("Palindrome String");
        else
        System.out.println("Non-palindromic String");
    }
}