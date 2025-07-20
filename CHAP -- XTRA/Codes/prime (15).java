class prime
{
public static void main(int n)
{
int m=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
m=1;
}
}
if(m==0)
{
System.out.println(n+" is a prime no.");
} 
else
{
System.out.println(n+" is not a prime no.");
}
}}