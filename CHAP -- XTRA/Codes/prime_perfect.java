class prime_perfect
{
public static void main(int n)
{
int h=0,s=0;
for(int i=1;i<=n;i++)
{
if(n%i==0)
{
h=1;
s=s+i;
}
}
if(h==0 && s==n)
{
System.out.println(n+" is a prime perfect no.");
}
else
{
System.out.println(n+" is not a prime perfect no.");
}
}}