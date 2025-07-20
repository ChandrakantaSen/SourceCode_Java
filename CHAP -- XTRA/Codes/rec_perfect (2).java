class rec_perfect
{static int i=1,s=0;
static int perfect(int n)
{
if(i==n)
return s;
else
{
if(n%i==0)
s=s+i;
i++;
return perfect(n);
    }
}
    static void main(int n)
    {
        if(perfect(n)==n)
        System.out.println("perfect no");
        else
        System.out.println("not a perfect no");
    }
}