class pallindrome
{
public static void main(int n)
{
int p,s=0,m=n;
while(n>0)
{
p=n%10;
s=(s*10)+p;
n=n/10;
}
if(s==m)
{
System.out.println(m+" is a pallindrome no.");
}
else
{
System.out.println(m+" is not a pallindrome no.");
}}}