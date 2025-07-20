class prime_pallindrome
{
public static void main(int n)
{
int k=0;
for(int i=2;i<n;i++)
{
if(n%i==0)
{
k=1;
}
}
int m=n,p,s=0;
while(m>0)
{
p=m%10;
m=m/10;
s=(s*10)+p;
}
if(k==0 && s==n)
{
System.out.println(n+" is a prime pallindrome number");
}
else
{
System.out.println(n+" is not a prime pallindrome number");
}
}}