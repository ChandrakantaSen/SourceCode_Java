class rec_palindrome
{static int s=0;
public static int palin(int n)
{
if(n==0)
{
return s;
    }
else
{s=s*10+n%10;
return palin(n/10);
    }
}
public static void main(int n)
{
if(n==palin(n))
System.out.println("palindrome no");
else
System.out.println("not an palindrome no");
    }
}