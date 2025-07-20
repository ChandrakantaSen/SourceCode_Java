class rec_armstrong
{
public static int arm(int n)
{
if(n==0)
{
return 0;
    }
else
{
return ((n%10)*(n%10)*(n%10))+arm(n/10);
    }
}
public static void main(int n)
{
if(n==arm(n))
System.out.println("amstrong no");
else
System.out.println("not an amstrong no");
    }
}