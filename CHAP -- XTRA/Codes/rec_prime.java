class rec_prime
{static int i=1,c=0;
static int prime(int n)
{
if(i>n)
return c;
else
{
if(n%i==0)
c++;
i++;
return prime(n);
    }
}
    static void main(int n)
    {
        if(prime(n)==2)
        System.out.println("prime no");
        else
        System.out.println("not a prime no");
    }
}